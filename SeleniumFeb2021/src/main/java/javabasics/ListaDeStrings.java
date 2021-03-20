package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeStrings {

	public static void main(String[] args) {
		// Una lista de Strings, remover iguales e invertir orden
		List<String> listaDeNombres = new ArrayList<>(); 
		listaDeNombres.add("Persona 1");
		listaDeNombres.add("Persona 2");
		listaDeNombres.add("Persona 3");
		listaDeNombres.add("Persona 4");
		listaDeNombres.add("Persona 5");
		listaDeNombres.add("Persona 1"); // # repetido
		listaDeNombres.add("Persona 2"); // # repetido
		listaDeNombres.add("Persona 3"); // # repetido
		//Imprimir lista tal como esta:
		System.out.println(listaDeNombres);
		//Imprimir al revés:
		Collections.sort(listaDeNombres, Collections.reverseOrder());
		System.out.println(listaDeNombres);
		//Eliminar los elementos repetidos de la lista de Strings
		List<String> nombresSinRepetir = listaDeNombres.stream().distinct().collect(Collectors.toList());
		System.out.println(nombresSinRepetir);

	}//main

}//class
