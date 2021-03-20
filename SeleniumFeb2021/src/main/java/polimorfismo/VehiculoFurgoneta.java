package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
	
	private int carga;
	
	/**
	 * @author Rafael Reyes Segura
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param carga
	 */
	
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the cilindrada
	 */
	
	public int getCarga() {
		return carga;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCarga [kg]: " + carga;
	}

}
