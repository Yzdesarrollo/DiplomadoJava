package CondicionalesSimples;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// 5. Por medio de una nota decimal, determinar 
		// s� el estudiante aprob� o no la clase 
		// (0 � 6 = Perdi� � 7 � 10 = Aprob�).
		
		double nota = 8.9;
		
		if(nota >= 7 && nota <= 10) {
			System.out.println("Aprob�!!!");
		}
		else {
			System.out.println("Reprob�!!!");
			
		}

	}

}
