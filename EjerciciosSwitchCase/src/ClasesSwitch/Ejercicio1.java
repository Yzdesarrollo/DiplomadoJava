package ClasesSwitch;

public class Ejercicio1 {
	
	public static void main (String args []) {
		
		// Desarrolla un programa donde por medio del tipo de un motor, determinar qu� tipo de fluido puede trasportar �ste seg�n las siguientes condiciones:
		//- Si el tipo de motor es 0, mostrar un mensaje por consola indicando �No hay establecido un valor definido para el tipo�.
		//- Si el tipo de motor es 1, mostrar un mensaje por consola indicando �Agua�.
		//- Si el tipo de motor es 2, mostrar un mensaje por consola indicando �Gasolina�.
		//- Si el tipo de motor es 3, mostrar un mensaje por consola indicando �Hormig�n�.
		//- Si no se cumple ninguno de los valores anteriores mostrar el mensaje �No existe un valor v�lido�.
		
		
		int motor = 1;
		
		switch(motor){
			
			case 0 : 
				System.out.println("No hay establecido un valor definido para el tipo");
				break;
				
			case 1 : 
				System.out.println("agua");
				break;
				
			case 2 :
				System.out.println("Gasolina");
				break;
				
			case 3 :
				System.out.println("Hormigon");
				break;
				
				default:
					System.out.println("No existe un valor valido");
						
		}
	}

}
