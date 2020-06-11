package ClasesFor;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Incremento de 2 en 2 hasta 20.
		for(int i = 0; i <= 20; i+=2) {
			System.out.println(i + " ");
		}
		
		// Otra forma para incrementar de 2 en 2
		for(int i = 0; i <= 20; i++) 
		{
			if(i % 2 == 0) 
			{
				System.out.println(i + "");
			}
		}
		
		// Decremento de 2 en 2
		
		for(int i = 20; i >= 0; i-=2) {
			System.out.println(i + " ");
		}
		
		// Desarrollar un programa que permita contar cuántos números entre 1 
		// y 1000 son múltiplos de 7, 
		// mostrar el resultado final.
		
		int contador = 0;
		
		for(int i = 1; i <= 1000; i++) 
		{
			if(i % 7 == 0) 
			{
				contador++;
			}
			
		}
		System.out.println("Los multiplos de 7 entre 1 y 1000 son: " + contador);

		// Desarrolla un programa que permita mostrar el factorial 
		// de un número definido previamente.
		
		
		// Desarrollar un problema que imprimir las tablas de multiplicar del 1 al 10 
		// con su respectivo resultado.
		
		for(int i = 1; i <=10; i++) 
		{
			System.out.println("Tabla de multiplicar del " + i);
			
			for(int j = 1; j <=10; j++) 
			{
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		
	}

}
