package CondicionalesSimples;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// 5. Por medio de una nota decimal, determinar 
		// sí el estudiante aprobó o no la clase 
		// (0 – 6 = Perdió – 7 – 10 = Aprobó).
		
		double nota = 8.9;
		
		if(nota >= 7 && nota <= 10) {
			System.out.println("Aprobó!!!");
		}
		else {
			System.out.println("Reprobó!!!");
			
		}

	}

}
