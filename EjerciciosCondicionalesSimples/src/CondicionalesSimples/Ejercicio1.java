package CondicionalesSimples;

public class Ejercicio1 {
	
	public static void main (String args []) {
		
		//1. Desarrollar un algoritmo que genere un número aleatorio de 1 a 100 (Math.random) 
		//y por medio de una condicional determinar 
		//sí el número es menor a 50 o mayor.
		
		int n1 = (int) (Math.random()*100);
		System.out.println("El numero es: " + n1);
		
		if(n1 > 50) {
			System.out.println("El numero: " + n1 + " es mayor a 50");
		}
		else {
			System.out.println("El numero: " + n1 + " es menor a 50");
		
		}
			
		
	}
		
}

