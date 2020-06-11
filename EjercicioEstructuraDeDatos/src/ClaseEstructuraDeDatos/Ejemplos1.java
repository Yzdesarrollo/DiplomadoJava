package ClaseEstructuraDeDatos;

import java.util.*;

public class Ejemplos1 {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in); // Creando un objeto de tipo Scanner
		
		System.out.println("Ingrese su nombre: "); // Pediendole al usuario ingresar su nombre
		
		String nombre = Sc.nextLine(); // Variable para almacenar el nombre
		
		System.out.println("Bienvenido " + nombre + ".Ingrese su edad"); // Pediendole al usuario ingresar su edad
		
		int edad = Sc.nextInt(); // Variable para almacenar la edad
		
		System.out.println("Gracias " + nombre + " tienes " + edad + " años"); // Mensaje final con los datos ingresados

	}

}
