package poo2;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Empleado E1 = new Empleado("Sergio");
		
		Directivo D1 = new Directivo("Ivan");
		
		Operario Op1 = new Operario("Lilia");
		
		Oficial O1 = new Oficial("Lilia");
		
		Tecnico T1 = new Tecnico("Omar");
		
		Empleado E2 = new Tecnico("Sergio"); //Uso del Polimorfismo
		
		System.out.println(E1);
		System.out.println(D1.toString());
		System.out.println(Op1);
		System.out.println(O1);
		System.out.println(T1);
		System.out.println(E2);
		
		

	}

}
