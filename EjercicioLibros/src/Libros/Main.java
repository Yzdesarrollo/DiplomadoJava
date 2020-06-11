package Libros;

public class Main {

	public static void main(String[] args) {
		
		Libros rayuela = new Libros(); //--> Instanciando la clase -> Creando el libro1
		
		rayuela.setAutor("Julio Cortázar"); // Asignando los valores a los atributos
		rayuela.setTitulo("Rayuela");
		rayuela.setPaginas(485);
		
		rayuela.mostrarLibro(); // LLamando al metodo para que muestre los libros
		
		//--------------------Creando el libro2---------------------------------------//
		
		Libros extranjero = new Libros(); //--> Instanciando la clase -> Creando el libro2
		
		extranjero.setAutor("Albert Camus"); // Asignando los valores a los atributos
		extranjero.setTitulo("El Extranjero");
		extranjero.setPaginas(219);
		
		extranjero.mostrarLibro(); //--> LLamando al metodo que muestra los libros
		
		System.out.println(rayuela.compararLibros(rayuela, extranjero)); //--> LLamando al metodo que imprima la comparacion.
	}

}
