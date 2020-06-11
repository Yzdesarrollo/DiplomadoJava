package Casa;

public class Main {

	public static void main(String[] args) {
		
		Casa Mia = new Casa(); //--> Creando objeto o instanciandolo de la clase Casa.
		
		System.out.println("Ciudad: " + Mia.getCiudad()); //--> Recibiendo los valores.
		System.out.println("Barrio: " + Mia.getBarrio());
		System.out.println("Color: " + Mia.getColor());
		System.out.println("Pisos: " + Mia.getPisos());
		System.out.println("Habitaciones: " + Mia.getHabitaciones());
		System.out.println("Baños: " + Mia.getBaños());
		System.out.println("Cocina: " + Mia.getCocinas());

	}

}
