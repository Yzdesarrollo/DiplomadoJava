package Ciudad; // FORMA 1 DE CREAR UNA CLASE

public class Ciudad { //--> Nombre de la clase (Plantilla)

	public String nombre;   //--> Atributos de la clase
	public int poblacion;
	public String pais;
	public String presidente;
	
	public Ciudad() //--> Constructor
	{
		
	}
	
	public String getNombre() {  //--> Getters y Setters
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	
	
	
	
}
