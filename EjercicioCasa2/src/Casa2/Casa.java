package Casa2;  // FORMA 3 DE CREAR UNA CLASE.

public class Casa { //--> Nombre de clase.
	
	private String ciudad; //--> Atributos de la clase.
	private String barrio;
	private String color;
	private int pisos;
	private int habitaciones;
	private int baños;
	private int cocinas;
	
	public Casa(String ciudad, String barrio, String color) { // Constructor de la clase inicializado con los atributos 
		
		this.ciudad = ciudad;
		this.barrio = barrio;
		this.color = color;
	}
								
	public String getCiudad() { //--> get = Recibe los valores
		return ciudad;
	}
	
	public String getBarrio() {
		return barrio;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setCiudad(String ciudad) { //--> set = Asigna los valores
		this.ciudad = ciudad;
	}
	
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

}
