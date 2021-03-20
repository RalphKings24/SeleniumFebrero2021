package javabasics;

public class MayorMenor {
	/* Ejercicio 2) Declara dos variables numéricas, indica cual es mayor a las 2
	 * o si son iguales.
	 * */
	
	public static void main(String[] args) {

		int numero1 = 5;
		int numero2 = 5;
		
		if(numero1>numero2) {
		System.out.println("El numero [" + numero1 + "] es mayor que el numero [" + numero2 + "]");
		}else if(numero1==numero2) {
			System.out.println("El numero [" + numero1 + "] y el numero [" + numero2 + "] son iguales");
		} 
		else {
			System.out.println("El numero [" + numero1 + "] es menor que el numero [" + numero2 + "]");
		}

	}

}//cierra clase
