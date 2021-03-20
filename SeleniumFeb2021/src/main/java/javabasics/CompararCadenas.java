package javabasics;

import java.util.Scanner;

public class CompararCadenas {

	public static void main(String[] args) {

		//Creamos Scanner para leer palabras
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe la primera palabra: ");
		String cadena1 = leer.next();
		
		System.out.println("Escribe la segunda palabra: ");
		String cadena2 = leer.next();
		
		if(cadena1.equals(cadena2)) {
			System.out.println("Es igual");
		}else {
			System.out.println("Es diferente");
		}
		if(cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Es igual");
		}
		else {
			System.out.println("Es diferente");
		}
		
		//Ejemplo de remplazar una letra, espacios o números por algo más: 
		String texto = "Un texto 24 es una composicion 04 de signos codificados en un sistema de escritura";
		String textoSinEspacio = texto.replace(" ", "$");
		String textoCambiaNumeros = texto.replace("24", "11");
		System.out.println(textoSinEspacio);
		System.out.println(textoCambiaNumeros);
		System.out.println("El texto tiene [" + texto.length() + "]" + " letras");

	}//Fin de main()

}//Fin de la clase
