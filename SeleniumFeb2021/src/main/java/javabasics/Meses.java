package javabasics;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero de mes: ");
		String mes = leer.next();
		
		switch(mes){
		case "1":
			System.out.println("El mes seleccionado es: Enero");
			break;
		case "2":
			System.out.println("El mes seleccionado es: Febrero");
			break;
		case "3":
			System.out.println("El mes seleccionado es: Marzo");
			break;
		case "4":
			System.out.println("El mes seleccionado es: Abril");
			break;
		case "5":
			System.out.println("El mes seleccionado es: Mayo");
			break;
		case "6":
			System.out.println("El mes seleccionado es: Junio");
			break;
		case "7":
			System.out.println("El mes seleccionado es: Julio");
			break;
		case "8":
			System.out.println("El mes seleccionado es: Agosto");
			break;
		case "9":
			System.out.println("El mes seleccionado es: Septiemre");
			break;
		case "10":
			System.out.println("El mes seleccionado es: Octubre");
			break;
		case "11":
			System.out.println("El mes seleccionado es: Noviembre");
			break;
		case "12":
			System.out.println("El mes seleccionado es: Diciembre");
			break;
		default:
			System.out.println("El numero que ingresaste no es valido");

		}

	}//Fin de main

}//Fin de clase
