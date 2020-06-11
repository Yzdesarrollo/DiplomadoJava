package Agenda;

public class Agenda {
	
	private Contactos agenda[] = new Contactos[10];
	
	public Agenda() {
		
	}
	
	public void listarContactos() 
	{
		for(int i = 0; i < agenda.length && agenda[i] != null; i++)
		{
			System.out.println("Nombre: " + agenda[i].getNombre() + " - Numero: " + agenda[i].getNumero());
		}
		
	}
	
	public boolean registrarContacto(Contactos contacto)
	{
		for(int i = 0; i < agenda.length; i++)
		{
			if(agenda[i] == null)
			{
				agenda[i] = contacto;
				return true;
			}
		}
		return true;
	}
	
	public void buscarContacto(String nombre)
	{
		for(int i = 0; i < agenda.length; i++)
		{
			if(agenda[i] != null && agenda[i].getNombre().contentEquals(nombre))
			{
				System.out.println("El numero del contacto es: " + agenda[i].getNumero());
			}	
		}
	}
	
	public int disponible()
	{
		int aux = 0;
		while(agenda[aux] != null)
		{
			aux++;
		}
		return 10-aux;
	}

}
