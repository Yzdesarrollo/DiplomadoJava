package Agenda;

public class Main {

	public static void main(String[] args) {
		
		Agenda agendita = new Agenda();
		Contactos contacto = new Contactos();
		Contactos contacto1 = new Contactos();
		Contactos contacto2 = new Contactos();
		
		contacto.setNombre("Diego");
		contacto.setNumero("3015491111");
		
		contacto1.setNombre("Andres");
		contacto1.setNumero("3127460571");
		
		contacto2.setNombre("Henry");
		contacto2.setNumero("3127340790");
		
		agendita.registrarContacto(contacto);
		agendita.registrarContacto(contacto1);
		agendita.registrarContacto(contacto2);
		agendita.listarContactos();
		agendita.buscarContacto("Henry");
		
		System.out.println("Contactos disponibles: " + agendita.disponible());
		
	}

}
