package ClaseEstructuraDeDatos;

import java.io.BufferedReader; // --> Importando las clases 
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplos {

	public static void main(String[] args) throws IOException // --> LLamando IOException
	{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Creando un objeto para usarlo para las entradas de datos

		System.out.println("Ingrese su nombre: " ); // --> Mensaje al usuario para que ingrese el nombre
		
		String nombre = br.readLine(); // --> Creando variable para guardar el dato.
		
		System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad: "); // --> Mensaje al usuario para que ingrese la edad
		
		String entrada = br.readLine(); // --> Variable para guardar la edad
		
		int edad = java.lang.Integer.parseInt(entrada); // --> Parseando el dato entrada convirtiendolo a entero
		
		System.out.println("Gracias " + nombre + " tienes " + edad + " años"); // Mostrando al usuario los datos ingresados
	
		
	}

}
