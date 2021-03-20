package polimorfismo;

public class Vehiculo {
	//Atributos:
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	/**
	 * @author Rafael Reyes Segura
	 * @param matricula
	 * @param marca
	 * @param modelo
	 */
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//>>> Getters <<<

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	
	//>>> Setters <<<

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * @return todos los datos del vehiculo
	 */
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
	}
	
	

}
