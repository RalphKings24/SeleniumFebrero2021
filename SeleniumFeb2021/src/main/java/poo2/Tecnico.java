package poo2;

public class Tecnico extends Operario {
	//Constructor
	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("Constructor de la clase Operario: ");
	}

	public String toString() {
		return super.toString() + " Tecnico";
	}
}
