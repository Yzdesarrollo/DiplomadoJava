package ClaseCicloWhile;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		/* Desarrollar un programa que permita contar cuantas vocales existentes en el siguiente parrafo.
		“Porta fames dis aenean platea neque semper? 
		Conubia eleifend commodo maecenas risus risus 
		pellentesque. Eros iaculis duis posuere integer 
		purus euismod consequat. Vel congue curabitur 
		penatibus ac mus nisi iaculis; scelerisque 
		feugiat blandit molestie euismod. Tincidunt 
		risus sociis nostra fermentum laoreet aliquet 
		aptent est. Platea non proin aliquet 
		scelerisque nam maecenas elit cum.” */
		
		String frase = "Porta fames dis aenean platea neque semper? \r\n" + 
				"		Conubia eleifend commodo maecenas risus risus \r\n" + 
				"		pellentesque. Eros iaculis duis posuere integer \r\n" + 
				"		purus euismod consequat. Vel congue curabitur \r\n" + 
				"		penatibus ac mus nisi iaculis; scelerisque \r\n" + 
				"		feugiat blandit molestie euismod. Tincidunt \r\n" + 
				"		risus sociis nostra fermentum laoreet aliquet \r\n" + 
				"		aptent est. Platea non proin aliquet \r\n" + 
				"		scelerisque nam maecenas elit cum.”";
		int auxiliar = frase.length()-1;
		int vocales = 0;
		
		while(auxiliar >= 0)
		{
			if(frase.charAt(auxiliar) == 'a' || frase.charAt(auxiliar) == 'e'
					|| frase.charAt(auxiliar) == 'i' || frase.charAt(auxiliar) == 'o' || frase.charAt(auxiliar) == 'u')
			{
				vocales++;
			}
			auxiliar--;	
		}
		System.out.println("La cantidad de vocales es: " + vocales);

	}

}
