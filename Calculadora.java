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
	/*
	if(opcion.equals(1)){
		resultado = a + b; 
	}else if(opcion.equals(2)){
		resultado = a - b;
	}else if(opcion.equals(3)){
		resultado = a * b;
	}else{
		resultado = a / b;
	}
	*/
	
	switch (opcion) {
	case 1:
		resultado = a * b;
		break;
	case 2:
		resultado = a / b;
		break;
	case 3:
		resultado = a + b; 
		break;
	default:
		resultado = a - b;
	}
 	
	System.out.println("El resultado es " + resultado.toString());

	}
}
