package Casa2;

public class Main {

	public static void main(String[] args) {
		
		Casa MiCasa = new Casa("Medellin", "Enciso", "Verde"); //--> Intanciado la clase (Creando un nuevo objeto)
		
		System.out.println("Ciudad: " + MiCasa.getCiudad()); //--> Recibiendo los valores de la instancia
		System.out.println("Barrio: " + MiCasa.getBarrio());
		System.out.println("Color: " + MiCasa.getColor());

	}

}
