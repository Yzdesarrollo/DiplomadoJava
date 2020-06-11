package Ciudad;

public class Main {

	public static void main(String[] args) {
		
		Ciudad Medellin = new Ciudad(); //--> Instanciando la clase Ciudad
										//--> Creando nuevo objeto llamado Medellin.
		
		Medellin.setNombre("Medellin"); //--> Asignando valores
		Medellin.setPais("Colombia");
		Medellin.setPoblacion(4264751);
		Medellin.setPresidente("Ivan Duque Márquez");
		
		System.out.println("Ciudad: " + Medellin.getNombre()); //--> Recibiendo los valores
		System.out.println("Pais: " + Medellin.getPais());
		System.out.println("Poblacion: " + Medellin.getPoblacion());
		System.out.println("Presidente " + Medellin.getPresidente());
		
		
		Ciudad Florencia = new Ciudad();
		
		Florencia.setNombre("Florencia");
		System.out.println("Ciudad: " + Florencia.getNombre());
	}

}
