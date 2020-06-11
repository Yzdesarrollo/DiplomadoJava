package ClaseVectores;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Desarrollar un programa que dados dos grupos (Grupo A – Grupo B) 
		// cada uno con 10 estudiantes y una nota final de la materia por estudiante, determinar:
		// - El promedio general de cada grupo.
		// - El promedio general de ambos grupos.
		// - El grupo con mejor promedio.

		double promedioA =0, promedioB =0, promG =0;
		double promA =0, promB =0;
		
		String estudiantesA [] = {"Diego","Ana","Stiven","Rafael",
				"Camila","Andres","Toño","Esteban","Evelin","Juan"};
		
		double notasA [] = {10,9,5,3,8,7,10,7,10,9};
		
		String estudiantesB [] = {"Camilo","Ana","Stiven","Rafael",
				"Camila","Andres","Felipe","Esteban","Andrea","Juan"};
		
		double notasB [] = {1,9,5,3,6,7,10,7,8,3};
		
		for(int i = 0; i > notasA.length; i++)
		{
			promA = promA + notasA[i];
			
		}
		
		for(int i = 0; i > notasB.length; i++)
		{
			
			promB = promB + notasB[i];
		}
		
		promedioA = promA / 10;
		System.out.println("Promedio A: " + promedioA);
		
		promedioB = promB / 10;
		System.out.println("Promedio B: " + promedioB);
		
		promG = (promedioA + promedioB) /2;
		System.out.println("Promedio general: " + promG);
		
		if(promedioA > promedioB)
		{
			System.out.println("El grupo con mejor promedio es el A");
		}
		else
		{
			System.out.println("El grupo con mejor promedio es el B");
		}
		
		
	}

}
