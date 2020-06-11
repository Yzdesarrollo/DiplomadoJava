package ClaseCicloWhile;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Desarrollar un programa que imprima 
		// los n�meros impares entre 1 y 25.
		
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

		String palabra = "Polit�cnico de Colombia";
		int j = 0;
		
		while(j < palabra.length())
		{
			System.out.println(palabra.charAt(j) + " ");
			j++;
		}
		
		// Hay dos m�todos nuevos que se aplican para solucionar este ejercicio y que son muy �tiles, �stos son:
		//- Length (): Devuelve el n�mero de caracteres del String, vector y otras estructuras de datos.
		// Se debe tener en cuenta que el m�todo al igual que lo hace el charAt, reconoce el espacio como un car�cter.
		
		//- charAt (): Devuelve el car�cter de una posici�n del String.
		// el m�todo charAt, este se aplica sobre variables de tipo String y se encarga de descomponer la variable en posiciones de 0 a N-1 (N siendo el n�mero de caracteres) a las cuales se puede acceder por medio de un �ndice 
		// (un n�mero asignado a la posici�n) por ejemplo:
		
		// Ej: 
		
		String palabra2 = "Diego";
		System.out.println("La palabra tiene " + palabra2.length() + " caracteres");
		
		String palabra3 = "Polit�cnico de Colombia";
		System.out.println("La palabra tiene " + palabra3.length() + " caracteres");
		
		
		String palabra4 = "Diego";
		int k = 0;
		
		System.out.println("La palabra " + palabra4 + " tiene " + palabra4.length() + " caracteres");
		
		while(k < palabra4.length()) 
		{
			System.out.println(palabra4.charAt(k) + " en la posicion: " + k);
			k++;
		}
		
		// Desarrollar un programa que genere n�meros aleatorios entre 1 y 50 y 
		// se detenga cuando genere un m�ltiplo de 10.
		
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
		
		/* Para la soluci�n de este ejercicio se utilizar� lo que se conoce como banderas, las banderas son variables booleanas que cambian cuando se cumplen ciertas caracter�sticas que se determine en el c�digo, 
		 * en este caso la bandera ser� la variable X inicializada en verdadero (para realizar la primera iteraci�n del ciclo) y el cambio de la bandera a X se dar� cuando el n�mero generado sea un m�ltiplo de 10 
		 * (Recordar el uso del m�dulo). 
		 * Para generar un n�mero aleatorio se utiliza como se ha visto la clase Math con su m�todo random para generar los n�meros entre 1 y 50.
		La ejecuci�n del ejercicio termina cuando inmediatamente encuentre el primer m�ltiplo de 10, dado que se desconoce en qu� momento se generar�, se utiliza el ciclo While y la bandera. */
		
		// 1. Desarrolla un programa que permita invertir la palabra �Programaci�n�. 
		// El resultado debe ser �n�icamargorP�.
		
		String palabra6 = "Programaci�n";
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
