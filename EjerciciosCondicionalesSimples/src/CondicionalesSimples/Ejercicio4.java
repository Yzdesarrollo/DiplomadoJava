package CondicionalesSimples;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// 4. Dados dos números enteros, determinar si uno es 
		// múltiplo del otro (Por medio del módulo).
		
		int numero1 = 65;
		int numero2 = 4;
		
		if(numero1 % numero2 == 0) {
			
			System.out.println("El numero " + numero2 + 
					" es multiplo de: " + numero1);
		}
		else {
			System.out.println("El numero " + numero2 + 
					" no es multiplo de: " + numero1);
		}

	}

}
