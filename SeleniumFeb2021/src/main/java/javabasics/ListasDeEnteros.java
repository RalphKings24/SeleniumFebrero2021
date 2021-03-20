package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {
		// Declarar nuestra lista de enteros
		List <Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(100);
		listaDeNumeros.add(2);
		listaDeNumeros.add(20);
		listaDeNumeros.add(3);
		listaDeNumeros.add(24);
		listaDeNumeros.add(20); //# Repetido
		listaDeNumeros.add(3); //# Repetido
		listaDeNumeros.add(24); //# Repetido
		
		// TAREA >>> ¿Cómo saber el número mayor y el número menor de la lista de arriba?
		
		//Imprime todos los elementos de nuestra lista:
		System.out.println(listaDeNumeros);
		
		//Ordenar la lista de menor a mayor:
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		
		//Ordenamos e invertimos el orden de nuestra lista:
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		
		//Imprime todos los elementos de nuestra lista invertida:
		System.out.println(listaDeNumeros);
		
		//Quitar elementos repetidos en la lista
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaDeNumeros.iterator();
		
		while(i.hasNext()) {
			Object temp = i.next();
			if(temp.equals(last)) {
				i.remove();
				numCount++;
			}else{
				last = temp;
			}//Fin de If-Else
		}//Fin de While
		
		System.out.println(listaDeNumeros);
		System.out.println("Habian " + numCount + " numeros repetidos"); //¿Cuantas veces se repiten los números de la lista?
	}//main

}//class
