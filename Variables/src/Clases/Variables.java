package Clases;

public class Variables {

	public static void main (String args []) {
		
		//byte: Emplea un solo byte(8 bits) de almacenamiento.
		//Esto permite almacenar valores entre [-128, 127]
		
		byte numeroByte = 9;
		
		//short: Emplea el doble de almacenamiento de (byte).
		//Esto permite almacenar valores entre [-32.768, 32.767].
		
		short numeroShort = 32767;
		
		//int: Emplea un tamaño mayor, 4 bytes (32 bits).
		//Esto permite almacenar valores entre [-2147483648, 2147483647].
		
		int numeroInt = 41825;
		
		//long: Emplea el tamaño mayor de todos los enteros, 8 bytes (64 bits).
		//Esto permite almacenar valores entre [-922337203685475808, 92233720368547775807].
		
		long numeroLong = 926465464697266565L;
		
		//float: Emplea un tamaño de 32 bits (4 bytes).
		//Esto permite almacenar valores entre [-3.4028234E+8, 1.40239846E-45].
		
		float numeroFloat = 5976464F;
		
		//double: Emplea un tamaño de 64 bits (8 bytes).
		//Esto permite almacenar valores entre [-179769313486223157E+309, 4.94065645841246544E-324].
		
		double numeroDouble = 2654792142478F;
		
		//boolean: Se emplea con la finalidad de trabajar con valores verdaderos/falsos (booleanos).
		//Se traducen sus valores en true/falso.
		
		boolean variableBoolean = true;
		
		//char: Se emplea para almacenar caracteres indiviudales (letras, aunque puede contener numeros).
		//Utiliza 16 bits y se codifica sobre UTF-16 Unicode.
		
		char numeroChar = 1;
		char letraChar = 'D';
		
		// String: se emplea creando una instancia de la clase String.
		
		String variableString = "Hola a todos";
		
		//Vector-Array: S emplea para almacenar
		//un grupo de datos del mismo tipo.
		
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
		
		//Matriz: Se emplea para almacenar un grupo de datos del mismo
		//de forma bidimensional basados en [x],[y].
		
		//Forma 1:
		int matrizNumeros1[][] = new int[4][5];
		//Forma 2:
		int [][]matrizNumeros2 = new int[4][5];
		//Forma 3:
		int[][] matrizNumeros3 = new int[4][5];
		//Forma 4:
		int matrizNumeros4[][];
		//Forma 5:
		int matrizNumeros5[][] = {};
		//Forma 6:
		int matrizNumeros6[][] = {{1,2},{3,9}};
		//Forma 7:
		int matrizNumeros7[][] = new int[][] {{6,2},{2,7}};
		
		
		//Operadores Aritmeticos
		
		int numero1;
		numero1 = 2;
		int numero2;
		numero2 = 3;
		System.out.println("la suma es:" + (numero1 + numero2));
		
		double n1 = 45.12 , n2 = 23.5;
		double resta = n1 - n2;
		System.out.println("El resultado de la resta es :" + resta);
		
		int n3 = 34;
		int n4 = 467;
		int multiplicacion;
		multiplicacion = n3 * n4;
		System.out.println("El resultao de la multiplicacion: " + multiplicacion);
		
		double n5 = 45.89, n6 = 34.9;
		double division = n5 / n6;
		System.out.println("El resultado de la division es: " + division);
		
		String numero = "12";
		int cambio = Integer.parseInt(numero);
		double doble = 4.5;
		int cambio2 = (int)doble;
		int modulo = cambio % cambio2;
		
		int a = 2;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		
		double valorPi = Math.PI;
		System.out.println(valorPi);
		
		
		
		
		
		
	}
}
