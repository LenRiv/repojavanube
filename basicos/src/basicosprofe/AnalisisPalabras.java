package basicosprofe;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class AnalisisPalabras {
				// El tipo que devuelvo
	private static boolean esPalindromo (String cad)
	{
		//Variable del mismo tipo
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		//Retorno la variable
		return bd;
	}
	
	public static void main(String[] args) {
		if (esPalindromo("poop"))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}
	
	

//	  private static boolean verificaPalindromo (String cadena)	{
//	      boolean esPalindromo = true;
//	      String cadenaMitadUno = "";
//	      String cadenaMitadDos = "";
//	      String cadenaMitadDosReversed = "";
//	      int j = cadena.length();
//
//	      cadenaMitadUno = cadena.substring(0,(j/2));
//	      cadenaMitadDos = cadena.substring((j/2));
//
//	      for (int i = 0; i < cadenaMitadDos.length(); i++ ) {
//	        cadenaMitadDosReversed = cadenaMitadDos.charAt(i) + cadenaMitadDosReversed;
//	      }
//
//	      esPalindromo = cadenaMitadUno.contentEquals(cadenaMitadDosReversed);
//	      System.out.println(cadenaMitadUno);
//	      System.out.println(cadenaMitadDos);
//	      return esPalindromo;
//	    }
//		
//		public static void main(String[] args) {
//			if (verificaPalindromo("poop"))	{
//				System.out.println("VERDADERO");
//			} else {
//				System.out.println("FALSO");
//			}
//		}
	
	
	//Recursiva
	
	

	public class Main {
	    public static void main(String[] args) {
	        String cadena = "Hola, mundo!";
	        char caracter = 'o';

	        int ultimaPosicion = buscarUltimaPosicionRecursiva(cadena, caracter, cadena.length() - 1);
	        if (ultimaPosicion != -1) {
	            System.out.println("El carácter '" + caracter + "' aparece por última vez en la posición: " + ultimaPosicion);
	        } else {
	            System.out.println("El carácter '" + caracter + "' no está presente en la cadena.");
	        }
	    }

	    public static int buscarUltimaPosicionRecursiva(String cadena, char caracter, int posicion) {
	        if (posicion < 0) {
	            return -1;
	        }

	        if (cadena.charAt(posicion) == caracter) {
	            return posicion;
	        }

	        return buscarUltimaPosicionRecursiva(cadena, caracter, posicion - 1);
	    }
	}

}


	
	
	

