package ClaseVectores;

public class Ejercicio3 {
	
	public static void main (String args []) {
		
		// Desarrollar un programa que, dada una palabra, divida todos sus caracteres 
		// y los almacene en las posiciones de un vector del tama�o de la palabra, por ejemplo:
		// - �Colombia�, tiene 8 palabras, por ende, el vector debe ser de tama�o 8 
		// para almacenar cada car�cter.
		
		String palabra = "America";
		
		char caracteres[] = new char[palabra.length()];
		
		for (int i = 0; i < palabra.length(); i++)
		{
			caracteres[i] = palabra.charAt(i);
		}
		
		for (int i = 0; i < caracteres.length; i++)
		{
			System.out.println("Caracter: " + caracteres[i]);
		}
	}

}
