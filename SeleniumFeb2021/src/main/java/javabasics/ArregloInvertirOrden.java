package javabasics;

public class ArregloInvertirOrden {
	
	/* 
	 * Dado un arreglo de 5 índices con los valores 1,2,3,4,5
	 * guardar los valores en otro arreglo y mostrarlo invertido el orden
	 * 
	 * */

	public static void main(String[] args) {
		
		//Creamos arreglo con 5 índices:
		int[] arreglo1 = {1,2,3,4,5}; //Se tiene el arreglo: 0 1 2 3 4
		
		int[] arreglo2 = new int[arreglo1.length]; //Se quiere obtener {5,4,3,2,1}
		
		for(int i = (arreglo1.length - 1), j = 0; i >= 0; i--, j++) {
			
			arreglo2[j] = arreglo1[i];
			
			System.out.println(arreglo2[j]);
		}//Arreglo 2 con índice 0 = 5
		//Arreglo 2 con índice 1 = 4

	}//Fin de main

}//Fin de clase
