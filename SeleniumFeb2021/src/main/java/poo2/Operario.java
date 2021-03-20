package poo2;

public class Operario extends Empleado {
	// Constructor
	public Operario(String nombre) {
		super(nombre);
		System.out.println("\nConstructor de la clase Operario");
	}

	@Override
	public String toString() {
		return super.toString() + " Operario";
	}

}
