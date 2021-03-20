package javabasics;

public class While {

	public static void main(String[] args) {

		int numero = 1;
		
		System.out.println("Para while: ");
		while(numero<=100) {
			System.out.println(numero);
			
			if(numero==24) {
				break;
			}
			
			numero++;
		}
		
		System.out.println("\nPara for: ");
		for(int i = 50; i <= 100; i++) {
			System.out.println(i);
		}

	}

}
