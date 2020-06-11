package ClaseCicloWhile;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Desarrollar un programa que determine si una palabra establecida 
		// previamente es o no palíndroma.
				
				String palabr = "ana";
				String palindroma = "";
				
				int auxi = palabr.length()-1;
				
				while(auxi >= 0)
				{
					palindroma = palindroma + palabr.charAt(auxi);
					auxi--;
				}
				if(palindroma.equals(palabr))
				{
					System.out.println("Es palindroma");
				}
				else
				{
					System.out.println("No es palindroma");
				}

	}

}
