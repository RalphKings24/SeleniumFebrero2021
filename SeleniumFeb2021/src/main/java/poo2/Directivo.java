package poo2;

public class Directivo extends Empleado {

	/**
	 * 
	 */
	public Directivo() {
		super();
		
	}

	/**
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
		System.out.println("\nConstructor de la clase Directivo");
		
	}

	@Override
	public String toString() {
		return super.toString() + " Directivo";
	}

}
