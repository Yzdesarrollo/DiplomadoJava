package ClasesSwitch;

public class Ejercicio2 {
	
	public static void main (String args []) {
		
		
		// Desarrollar una calculadora, la cual, en base a un operador, realice una operaci�n con dos n�meros enteros ya definidos y mostrar el resultado, los operadores a tener en cuenta son los vistos en la tabla de operadores aritm�ticos, s� deseas agregar m�s operadores, si�ntete en 
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
			System.out.println("Multiplicaci�n: " + resultado);
			break;
			
		case '/':
			resultado = num1 / num2 ;
			System.out.println("Divisi�n: " + resultado);
			break;
			
			default:
				System.out.println("Error");
		}
		

		
	}

}
