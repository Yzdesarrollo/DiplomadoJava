package ClaseCicloWhile;

public class Ejercicio4 
{
	
	public static void main (String args []) 
	{
		
		// Desarrollar un programa que continúe con la serie 
		// sumatoria de 11 – 22 – 33 – 44. Debe mostrar únicamente los primeros 
		// 25 valores de la serie.
		
		int serie = 0;
		int aux = 0;
		
		while(aux < 25)
		{
			serie = serie + 11;
			System.out.print(serie + " ");
			aux++;
		}
		
	}

}
