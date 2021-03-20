package poo2;

public class Empleado {

	// Atributos
	private String nombre;

	// Constructor
	public Empleado() {
	}

	public Empleado(String nombre) {
		this.nombre = nombre.toString();
		System.out.println("Constructor de la clase Empleado: " + nombre);
		System.out.println("");
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado: " + nombre;
	}

}// End class "Empleado"
