package Libros;

public class Libros { //--> Nombre de la clase

	private String autor; //--> Atributos de la clase
	private String titulo;
	private int paginas;
	
	public Libros() { //--> Constructor
		
	}
	
	public String getAutor() { // get -> Recibiendo
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public void setAutor(String autor) { // Asignando los valores
		this.autor = autor;
	}
	

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public void mostrarLibro() //--> Metodo que muestra los libros
	{
		System.out.println("El libro " + titulo + ", del autor " + autor +
		", tiene " + paginas + " paginas");
	}
	
	public String compararLibros(Libros libro1, Libros libro2) //--> Metodo que compara cual de los 2 libros tiene mas Paginas.
	{
		return libro1.getPaginas() > libro2.getPaginas() ? libro1.getTitulo() + 
		" tiene más páginas" : libro2.getTitulo() + " tiene más páginas";
		
	}
	
}
