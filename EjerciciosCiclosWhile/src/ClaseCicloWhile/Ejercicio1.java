package ClaseCicloWhile;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Desarrollar un programa que imprima 
		// los números impares entre 1 y 25.
		
		int i = 1;
		
		while(i <= 25) 
		{
			if(i % 2 != 0) 
			{
				System.out.println(i + " ");
			}
			
			i++;
		}
		
		// Desarrollar un programa que, dada una palabra, 
		// descomponer todos sus caracteres.

		String palabra = "Politécnico de Colombia";
		int j = 0;
		
		while(j < palabra.length())
		{
			System.out.println(palabra.charAt(j) + " ");
			j++;
		}
		
		// Hay dos métodos nuevos que se aplican para solucionar este ejercicio y que son muy útiles, éstos son:
		//- Length (): Devuelve el número de caracteres del String, vector y otras estructuras de datos.
		// Se debe tener en cuenta que el método al igual que lo hace el charAt, reconoce el espacio como un carácter.
		
		//- charAt (): Devuelve el carácter de una posición del String.
		// el método charAt, este se aplica sobre variables de tipo String y se encarga de descomponer la variable en posiciones de 0 a N-1 (N siendo el número de caracteres) a las cuales se puede acceder por medio de un índice 
		// (un número asignado a la posición) por ejemplo:
		
		// Ej: 
		
		String palabra2 = "Diego";
		System.out.println("La palabra tiene " + palabra2.length() + " caracteres");
		
		String palabra3 = "Politécnico de Colombia";
		System.out.println("La palabra tiene " + palabra3.length() + " caracteres");
		
		
		String palabra4 = "Diego";
		int k = 0;
		
		System.out.println("La palabra " + palabra4 + " tiene " + palabra4.length() + " caracteres");
		
		while(k < palabra4.length()) 
		{
			System.out.println(palabra4.charAt(k) + " en la posicion: " + k);
			k++;
		}
		
		// Desarrollar un programa que genere números aleatorios entre 1 y 50 y 
		// se detenga cuando genere un múltiplo de 10.
		
		boolean x = true; // banderas
		while(x)
		{
			double n = Math.ceil(Math.random()*50);
			System.out.println(n);
			
			if(n % 10 == 0)
			{
				x = false;
			}
			
		}
		
		/* Para la solución de este ejercicio se utilizará lo que se conoce como banderas, las banderas son variables booleanas que cambian cuando se cumplen ciertas características que se determine en el código, 
		 * en este caso la bandera será la variable X inicializada en verdadero (para realizar la primera iteración del ciclo) y el cambio de la bandera a X se dará cuando el número generado sea un múltiplo de 10 
		 * (Recordar el uso del módulo). 
		 * Para generar un número aleatorio se utiliza como se ha visto la clase Math con su método random para generar los números entre 1 y 50.
		La ejecución del ejercicio termina cuando inmediatamente encuentre el primer múltiplo de 10, dado que se desconoce en qué momento se generará, se utiliza el ciclo While y la bandera. */
		
		// 1. Desarrolla un programa que permita invertir la palabra “Programación”. 
		// El resultado debe ser “nóicamargorP”.
		
		String palabra6 = "Programación";
		String invertida = "";
		
		int aux = palabra6.length()-1;
		
		while(aux >= 0) 
		{
			invertida = invertida + palabra.charAt(aux);
			aux--;	
		}
		
		System.out.println(invertida);
	
	}
	
}
