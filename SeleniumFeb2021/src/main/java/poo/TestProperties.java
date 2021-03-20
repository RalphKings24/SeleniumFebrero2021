package poo;

import comun.LeerProperties;

public class TestProperties {

	public static void main(String[] args) {

		LeerProperties prop = new LeerProperties();

		prop.getSystemProperties();

		String mensaje = System.getProperty("MENSAJE");
		String mensaje2 = System.getProperty("MENSAJE2");
		String mensaje3 = System.getProperty("MENSAJE3");
		int numero = Integer.parseInt(System.getProperty("NUMERO"));

		System.out.println(mensaje);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		System.out.println(numero);

		prop.setSystemPropFileName(System.getProperty("user.dir") + "\\src\\main\\resources\\dataFiles\\data2.properties");
		prop.getSystemProperties();

		String mensaje4 = System.getProperty("NUEVO");
		System.out.println(mensaje4);
		
		// ¿Cómo leer datos del archivo 2?
		
		


	}// End main

}// End class
