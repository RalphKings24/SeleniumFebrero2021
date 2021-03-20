package javabasics;

public class Cadenas {

	//Dada una cadena de caracteres, extraer la cuarta y quinta letra usando el método "substring"
	
	public static void main(String[] args) {
		
		String cadena = "Hola Curso Selenium";
		
		String subcadena = cadena.substring(0, 4);
		
		System.out.println(subcadena);
		
		if(cadena.equals("Hola Curso Selenium")) {
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("Las cadenas NO son iguales");
		}
		
		if(cadena.contains("Curso")) {
			System.out.println("Si esta la palabra");
		}else {
			System.out.println("No esta la palabra");
		}
		
		if(cadena.equalsIgnoreCase("hola curso selenium")) {
			System.out.println("Si esta la palabra");
		}else {
			System.out.println("No esta la palabra");
		}
	} 
	
}
