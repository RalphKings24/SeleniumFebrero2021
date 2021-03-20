package javabasics;

import javax.swing.JOptionPane;

public class AreaCirculo {
	/* Ejercicio 4) Calcular el área de un círculo, ingresando el radio del círculo por teclado.
	 * */
	
	public static void main(String[] args) {
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del circulo: "));
		
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es: " + area);
	}

}
