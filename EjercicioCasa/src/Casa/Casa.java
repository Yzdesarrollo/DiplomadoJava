package Casa;  // FORMA 2 DE CREAR UNA CLASE

public class Casa { //--> Nombre de la clase
	
	final private String ciudad = "Medellin";    // Atributos de la clase constantes
	final private String barrio = "Buenos Aires";
	final private String color = "Blanca";
	final private int pisos = 2;
	final private int habitaciones = 2;
	final private int baños = 1;
	final private int cocinas = 1;
	
	
	public String getCiudad() {  // Recibiendo los valores con get.
		
		return ciudad;
	}
	
	public String getBarrio() {
		
		return barrio;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public int getPisos() {
			
			return pisos;
		}
	
	public int getHabitaciones() {
			
			return habitaciones;
		}
	
	public int getBaños() {
		
		return baños;
	}
	
	public int getCocinas() {
		
		return cocinas;
	}
	

}
