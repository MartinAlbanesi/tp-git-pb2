import java.util.Scanner;

public class Calculadora {

public static void main(String[] args) {
	Integer a;
	Integer b;
	Integer opcion;
	Integer resultado;
	Scanner teclado = new Scanner(System.in);
 
	//Menu de opciones y verificación de opción correcta
	do{
		System.out.println("Ingrese su operación /n 1 para multiplicar /n 2 para dividir /n 3 para sumar /n 4 para restar");
		opcion = teclado.nextInt();
	}while(opcion < 1 || opcion > 4);
	
	//Ingreso de datos por teclado
	System.out.println("Ingrese el primer numero");
	a = teclado.nextInt();
	System.out.println("Ingrese el segundo numero");
	b = teclado.nextInt();
 
	//Calculo de operaciones según opcion ingresada
	switch (opcion) {
		case 1:
			resultado = multiplicar(a,b);
			break;
		case 2:
			resultado = dividir(a,b);
			break;
		case 3:
			resultado = sumar(a,b);
			break;
		default:
			resultado = restar(a,b);
	}
 	
	System.out.println("El resultado es " + resultado.toString());

	}

//Metodos de Calculadora
public static Integer sumar(Integer a, Integer b) {
	return a + b;
}

public static Integer restar(Integer a, Integer b) {
	return a - b;
}

public static Integer multiplicar(Integer a, Integer b) {
	return a * b;
}

public static Integer dividir(Integer a, Integer b) {
	return a / b;
}

}

/*
 * Al realizar el segundo push, me tiró el siguiente error "fatal: Could not read from remote repository."
 * Este error fue debido a que puse la dirección SSH en lugar de HTTPS al settear la URL del repositorio remoto
 * Luego me tiró el siguiente error "Invalid username or password."
 * Logre solucionarlo utilizando el siguiente comando "git config --global user.name" y creando un token de acceso personal.
 * Al realizar el push me pidió la contraseña y al usar el token logré realizarlo sin problemas.
 * Para evitar el problema en un futuro es recomentable configurar los datos de git con el comando "git config" y crear un token de acceso personal (con o sin vencimiento)
 
 *El parámetro -b se refiere al termino branch (rama en español), en este caso se utiliza "git checkout -b develop" para crear una nueva rama llamada "develop"
 *
 *Para realizar un merge request tengo que importar el proyecto a GitLab, pero debido a un error de la página no pude importarlo correctamente.
 *Desde GitHub se puede realizar un merge de los pull request al proyecto. Previo a realizar el merge se debe revisar los cambios y fixes realizados en el codigo y luego realizar el merge de todos los pull request dentro del proyecto.
 */

