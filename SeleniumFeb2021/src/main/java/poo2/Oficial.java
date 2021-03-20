package poo2;

public class Oficial extends Operario {
	//Constructor
	public Oficial(String nombre) {
		super(nombre);
		System.out.println("Constructor de la clase Oficial");
	}

	@Override
	public String toString() {
		return super.toString() + " Oficial";
	}

}
