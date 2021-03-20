package javabasics;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		//Ingresar un n�mero y que multiplique del 1 al 10
		
		Scanner teclado = new Scanner(System.in);
		
		int resultado = 0;
		int numeroTemporal = 0;
		
		System.out.println("Ingresa el n�mero que quieres multiplicar: ");
		numeroTemporal = teclado.nextInt();
		teclado.close();
		
		while(numeroTemporal <= 0){
			System.out.println("El n�mero que ingresaste debe ser mayor a cero. Por favor ingresa un n�mero positivo: ");
			numeroTemporal = teclado.nextInt();
		}//Fin de "while"
		
		for(int i = 1; i <= 10; i++) {
			resultado = i * numeroTemporal;
			System.out.println("La multiplicaci�n de " + numeroTemporal + " por " + i + " es: " + resultado);
		}//Fin de "for"
		
	}//Fin de main

}//Fin de la clase
