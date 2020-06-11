package CondicionalesSimples;

public class Ejercicio2 {
	
	public static void main (String args []) {
		
		//2. Dados dos números enteros, determinar cuál es el mayor por medio de una condicional 
		//y realizar una potencia con el número menor 
		//como exponente (Math.pow).
		
		int n2 = 10;
		int n3 = 4;
		
		System.out.println("El numero es: " + n2);
		System.out.println("El numero es: " + n3);
		
		if(n2 > n3) {
			
			System.out.println("El numero " + n2 + 
			" Es mayor " + "Y su potencia es: " + Math.pow(n2, n3));	
		}
		else {
			System.out.println("El numero " + n3 + 
			" Es menor " + "Y su potencia es: " + Math.pow(n2, n3));
			
		}
	}

}
