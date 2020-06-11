package ClaseMath;

public class Ejercicio4 {
	
	public static void main (String args []) {
		
		//Para generar numeros aleatorios
		// de 1 y 50.
		double n1 = (Math.random()*50);
		double n2 = (Math.random()*50);
		
		//Redondear las 2 variables creadas anteriormente.
		int n1Redondeado = (int) Math.ceil(n1);
		int n2Redondeado = (int) Math.round(n2);
		
		System.out.println(n1Redondeado);
		System.out.println(n2Redondeado);
		
		// Calcualar el numero mayor usamos Math.max
		System.out.println(" El numero mayor es: " + Math.max(n1Redondeado, n2Redondeado));
	}

}
