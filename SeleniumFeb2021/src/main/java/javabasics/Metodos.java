package javabasics;

public class Metodos {
	
	int numero1, numero2;
	
	public Metodos(int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public void mensajeBienvenida () {
		System.out.println("Bienvenidos a su curso de Selenium");
	}
	
	public int sumatoria() {
		return numero1+numero2;
	}
	
	public String mostrarNombre(String nombre) {
		System.out.println(nombre);
		return nombre;
	}
	


}
