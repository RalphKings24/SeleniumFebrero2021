package javabasics;

public class SumaArreglo {

	public static void main(String[] args) {

		//Crear nuestro arreglo de 5 índices:
		
		int[] numeros = new int[5];
		int suma = 0;
		
		//Recorrer el arreglo, asignar numero y sumar:
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			suma += numeros[i]; //suma = suma + numeros[i];
		}
		
		//Mostramos el resultado de la suma:
		
		System.out.println(suma);
				
	}//Fin de main

}//Fin de clase
