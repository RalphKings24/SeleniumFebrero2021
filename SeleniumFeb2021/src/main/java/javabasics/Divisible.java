package javabasics;

import javax.swing.JOptionPane;

public class Divisible {
	
	/* Ejercicio 3) Lee un número por tclado e indica si es divisible entre dos (resto = 0)
	 * indicar su no lo es.
	 * */

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
		
		if(numero%2==0) {
			System.out.println("El numero ingresado [" + numero + "] es divisible entre 2");
		}else {
			System.out.println("El numero ingresado [" + numero + "] NO es divisible entre 2");
		}

	}

}
