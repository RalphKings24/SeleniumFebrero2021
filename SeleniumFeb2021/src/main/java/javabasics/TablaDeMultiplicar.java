package javabasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		//Ingresar un número y que multiplique del 1 al 10
		
		Scanner teclado = new Scanner(System.in);
		
		int resultado = 0;
		int numeroTemporal = 0;
		
		System.out.println("Ingresa el número que quieres multiplicar: ");
		numeroTemporal = teclado.nextInt();
		teclado.close();
		
		while(numeroTemporal <= 0){
			System.out.println("El número que ingresaste debe ser mayor a cero. Por favor ingresa un número positivo: ");
			numeroTemporal = teclado.nextInt();
		}//Fin de "while"
		
		for(int i = 1; i <= 10; i++) {
			resultado = i * numeroTemporal;
			System.out.println("La multiplicación de " + numeroTemporal + " por " + i + " es: " + resultado);
		}//Fin de "for"
		
	}//Fin de main

}//Fin de la clase
