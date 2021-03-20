package poo;

public class Cuenta {
	
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param N/A
	 * */
	
	public Cuenta() {
		
	}//Fin del constructor Cuenta()
	
	/** 
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param String, String, double, double
	 * */
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo){
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;		
	}//Fin del contructor de Cuenta con argumentos.
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param Object
	 * */
	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}//Fin de Cuenta con objeto
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param String
	 * */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param String
	 * */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param double
	 * */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param double
	 * */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param String
	 * */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param String
	 * */
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param double
	 * */
	public double getTipoInteres() {
		return this.tipoInteres;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param double
	 * */
	public double getSaldo() {
		return this.saldo;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param double
	 * */
	public boolean ingreso(double n){
		boolean ingresoCorrecto = true;
		
		if(n < 0){
			ingresoCorrecto = false;
		}else {
			saldo = saldo + n;
		}
		return ingresoCorrecto;
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param double
	 * */
	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;
		if(n < 0) {
			reintegroCorrecto = false;
		}else if(saldo >= n) {
			saldo -= n; //saldo = saldo - n;
		}else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;		
	}
	
	/**
	 * @autor Rafael Reyes
	 * @date 06/Marzo/2021
	 * @param double
	 * */
	 public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		if(n < 0) {
			correcto = false;
		}else if(saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		}else {
			correcto = false;
		}
		return correcto;		
 }
}//Fin de clase "Cuenta"
