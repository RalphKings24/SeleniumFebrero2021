package javabasics;

import javax.swing.JOptionPane;

public class Arreglo {

	public static void main(String[] args) {

		int numeros[] = new int[5];
		
		rellenarListaDeNumeros(numeros);
		
		mostrarArreglo(numeros);
		//Valores a ingresar en consola = 5,6,7,8,9
				
	}//Fin de main
	
	public static void rellenarListaDeNumeros(int arreglo[]) {
		for(int i = 0; i<arreglo.length; i++) {
			String texto = JOptionPane.showInputDialog("Ingresa un numero: ");
			arreglo[i] = Integer.parseInt(texto);
		}
	}//Fin de rellenarListaDeNumeros
	
	public static void mostrarArreglo(int arreglo[]) {
		for(int i = 0; i<arreglo.length; i++) {
			System.out.println("El indice [" + i + "] " + "tiene el valor de [numero = " + arreglo[i] + "]");
		}
	}//Fin de mostrarArreglo

}//Fin de clase
