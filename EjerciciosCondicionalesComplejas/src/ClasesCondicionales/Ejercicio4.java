package ClasesCondicionales;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Un postulante a un empleo, realiza un test de capacitaci�n, se obtuvo la siguiente informaci�n: cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contest� 
		// correctamente. Desarrolle un programa que informe el nivel seg�n el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
		// 1. Nivel m�ximo: Porcentaje >= 90%.
		// 2. Nivel medio: Porcentaje >= 75% y <90%.
	    // 3. Nivel regular: Porcentaje >= 50% y <75%.
		// 4. Fuera de nivel: Porcentaje < 50%.

		
		int preguntas = 10;
		int correctas = 4;
		
		double porcentaje = (correctas*100)/ preguntas;
		
		if(porcentaje >= 90) {
			
			System.out.println("Nivel M�ximo");
		}
		else if(porcentaje >= 75 && porcentaje < 90) {
			
			System.out.println("Nivel medio");
		}
		else if(porcentaje >= 50 && porcentaje < 75) {
			
			System.out.println("Nivel medio");
		}
		else if(porcentaje < 50) {
			
			System.out.println("Fuera de nivel");
		}
		
	}

}
