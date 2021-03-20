package polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos[0] = new Vehiculo("GFER324","Ford","2009");
		misVehiculos[1] = new VehiculoTurismo(4,"IUI637","Audi","2012");
		misVehiculos[2] = new VehiculoDeportivo("GFG925","BMW","2021",8);
		misVehiculos[3] = new VehiculoFurgoneta("OKI249","Nissan","2020",1000);
		
		//De otra manera también se puede 
		Vehiculo vehiculoDeportivo = new VehiculoDeportivo("RAL2404","VOLVO","2021",12);
		System.out.println(vehiculoDeportivo.mostrarDatos() + "\n");
		
		//"vehiculos = misVehiculos[0]" después "vehiculos = misVehiculos[1]" después "vehiculos = misVehiculos[2]" y después "vehiculos = misVehiculos[3]"
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}

	}

}
