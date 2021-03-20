package javabasics;

public class HolaMundo { // open class

	String miNombre = "Rafael Reyes";
	int edad = 32;

	// Casi no se usan:
	float edadConDecimal = (float) 32.0;
	char letra = 'f';

	double edadDoble = 32.0000000;
	boolean bandera = true;

	public static void main(String[] args) {

		System.out.println("Hola Mundo");

		double numero1 = 500.00035;
		double numero2 = 35.37;
		double resultado = numero1 + numero2;

		String nombre = "Sergio";
		String test = nombre + numero1;

		System.out.println("El resultado de la suma es: " + resultado);
		System.out.println("El resultado de la suma es: " + (numero1 + numero2));
		System.out.println("El resultado de la resta es: " + (numero1 - numero2));
		System.out.println("El resultado de la multiplicacion es: " + (numero1 * numero2));
		System.out.println("El resultado de la division es: " + (numero1 / numero2));

		System.out.println("El resultado de la prueba es: " + test);

	}

} // end class
