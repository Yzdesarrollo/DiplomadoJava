package ClasesOperadores;

public class Ejercicio6 {
	
	public static void main (String args []) {
		
		
		int ladoCuadrado = 8;
		int area = (int) Math.pow(ladoCuadrado, 2); // ladoCuadrado * ladoCuadrado;
		int perimetro = ladoCuadrado * 4;
		
		System.out.println(area);
		System.out.println(perimetro);
		
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulos = 8;
		
		int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		int Perimetro = (ladoUnoTriangulo * 2) + baseTriangulo;
		
		System.out.println(areaTriangulo);
		System.out.println(Perimetro);
		
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		int areaRec = baseRectangulo * alturaRectangulo;
		int PerimetroRec = (baseRectangulo * 2) + (alturaRectangulo * 2);
		
		System.out.println(areaRec);
		System.out.println(PerimetroRec);
		
		
	}

}
