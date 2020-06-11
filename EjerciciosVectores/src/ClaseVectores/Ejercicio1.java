package ClaseVectores;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Formas de escribir un vector:
		
		//Forma 1:
		int vectorNumeros1[] = new int[10];
		//Forma 2:
		int []vectorNumeros2 = new int[10];
		//Forma 3:
		int[] vectorNumeros3 = new int[10];
		//Forma 4:
		int vectorNumeros4[];
		//Forma 5:
		int vectorNumeros5[] = {};
		//Forma 6:
		int vectorNmeros6[] = {9,8,7,6,5,4,3,2,1,0};
		//Forma 7:
		int vectorNumeros7[] = new int[] {9,8,7,6,5,4,3,2,1,0};
		
		// Desarrollar un programa que, mediante el uso de dos vectores, 
		// permita almacenar las 5 notas de un estudiante 
		// para calcular su promedio final, los valores para calcular el promedio se encuentran en un vector a parte que contiene los porcentajes 
		// asignados a cada nota.

		double notas[] = new double[5];
		int porcentajes[] = {20,10,30,20,20};
		
		notas[0] = 4.5;
		notas[1] = 3.2;
		notas[2] = 5.0;
		notas[3] = 1.5;
		notas[4] = 4.3;
		
		double promedio = 0;
		
		for(int i = 0; i < notas.length; i++)
		{
			promedio = (notas[i] * (porcentajes[i]) / 100) + promedio;
		}
		
		System.out.println("Promedio final " + Math.round(promedio));
		
		
		// Desarrollar un programa que por medio de un vector de tipo float permita almacenar el peso de 5 personas para posteriormente:
		// - Determinar el promedio del peso de las 5 personas.
		// - Determinar cuántas personas superar el promedio del peso.
		// - Determinar cuántas personas son inferiores al promedio del peso.
		
		float pesos[] = {85.3f,95.8f,62.4f,47.9f,87.0f};
		float prom = 0.0f;
		float promedio1 = 0.0f;
		float max = 0;
		float min = 0;
		
		for (int i = 0; i < pesos.length; i++)
		{
			prom = prom + pesos[i];
		}
		
		promedio1 = prom / 5;
		
		for (int i = 0; i < pesos.length; i++)
		{
			if(pesos[i] > promedio1)
			{
				max++;
			}
			else
			{
				min++;
			}
		}
		
		System.out.println("El promedio es: " + promedio1);
		System.out.println("Por encima del promedio " + max);
		System.out.println("Por debajo del promedio " + min);
		
		int edades[] = new int[5];
		System.out.println(edades[2]);
	}
}
