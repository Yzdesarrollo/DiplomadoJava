package ClasesCondicionales;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		// Desarrollar un programa que, por medio de 3 números enteros, 
		// determinar cuál es el mayor.
		
		int numero1 = 3;
		int numero2 = 5;
		int numero3 = 10;
		int mayor = numero1;
		
		if(numero2 > mayor) {
			mayor = numero2;
		}
		if(numero3 > mayor) {
			mayor = numero3;
		}
		
		System.out.println(" EL numero mayor es: " + mayor);

	}

}
