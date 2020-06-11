package ClasesSwitch;

public class Ejercicio2 {
	
	public static void main (String args []) {
		
		
		// Desarrollar una calculadora, la cual, en base a un operador, realice una operación con dos números enteros ya definidos y mostrar el resultado, los operadores a tener en cuenta son los vistos en la tabla de operadores aritméticos, sí deseas agregar más operadores, siéntete en 
		//libertad de hacerlo.
		
		double num1 = 25;
		double num2 = 5;
		char operador = '/';
		double resultado = 0;
		
		switch(operador) {
		
		case '+':
			resultado = num1 + num2 ;
			System.out.println("Suma: " + resultado);
			break;
			
		case '-':
			resultado = num1 - num2 ;
			System.out.println("Resta: " + resultado);
			break;
			
		case '*':
			resultado = num1 * num2 ;
			System.out.println("Multiplicación: " + resultado);
			break;
			
		case '/':
			resultado = num1 / num2 ;
			System.out.println("División: " + resultado);
			break;
			
			default:
				System.out.println("Error");
		}
		

		
	}

}
