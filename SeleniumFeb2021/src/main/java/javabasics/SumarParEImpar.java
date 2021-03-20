package javabasics;

import java.util.Scanner;

public class SumarParEImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double par = 0;
		double impar = 0;
		double residuo;
		double numeroTemporal;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Ingrese el numero: [" + i + "]");
			numeroTemporal = teclado.nextFloat();
			
			while(numeroTemporal<0) {
				System.out.println("El número debe ser mayor a cero y tu numero es " + numeroTemporal + "\nIngresa un nuevo numero por favor!");
				numeroTemporal = teclado.nextFloat();
			}
			
			residuo = numeroTemporal%2;
			
			if(residuo==0) {
				par+=numeroTemporal; //par = par + numeroTemporal
				System.out.println("El numero par es: " + numeroTemporal);
			}
			
			if(residuo!=0) {
				impar+=numeroTemporal; //impar = impar + numeroTemporal
				System.out.println("El numero impar es: " + numeroTemporal);
			}
		}
		teclado.close(); //Se cierra el scanner
		System.out.println("\nLa sumatoria de los pares es: [" + par + "]");
		System.out.println("\nLa sumatoria de los impares es: [" + impar + "]");

	}//Fin de main

}//Fin de clase