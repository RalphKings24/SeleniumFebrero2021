package poo;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		//Se crean las variables locales
		String nombre;
		String numero;
		double tipo;
		double importe;
		
		//Vamos a crear un objeto de nuestra clase Cuenta, usando el constructor sin parámetros.
		Cuenta cuenta1 = new Cuenta();
		System.out.println("Ingresa un nombre: ");
		nombre = teclado.next();
		
		System.out.println("Ingresa un numero de cuenta: ");
		numero = teclado.next();
		
		System.out.println("Tipo de interes: ");
		tipo = teclado.nextDouble();
		
		System.out.println("Saldo: ");
		importe = teclado.nextDouble();
		teclado.close();
		
		//Asignar valores con nuestros métodos "set"
		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		
		//Utilizar nuestro constructor con parametros y asignarlos
		Cuenta cuenta2 = new Cuenta("Edna Del Valle","111088",12.5,5000);
		System.out.println(cuenta2.getNombre());
		
		//Utilizar el contructor que recibe un objeto
		Cuenta cuenta3 = new Cuenta(cuenta1);
		
		//Ingreso en la cuenta 1:
		cuenta1.ingreso(4000);
		System.out.println("-------------------------------");
		System.out.println("Cuenta 1 - Saldo despues del ingreso: " + cuenta1.getSaldo());
		System.out.println("Cuenta 3 - Saldo: " + cuenta3.getSaldo());
		System.out.println("Tipo de interes: " + cuenta1.getTipoInteres());
		
		//Ingreso en la cuenta 1:
		System.out.println("-------------------------------");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("El numero de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interes: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());

	}//End main

}//End class
