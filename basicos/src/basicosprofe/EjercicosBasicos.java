package basicosprofe;

import java.util.Scanner;

/**
 * 
 * LISTA DE EJERCICIOS DE REPASO A LA PARTE DE INICIACIÓN EN JAVA:
 * 
 * 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
 * PERTENECE A LA CADENA O NO perteneceACadena 2) HACER UN MÉTODO QUE RECIBA UNA
 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
 * 
 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
 * 
 * 
 * 3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar 4) HACER UN
 * MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO
 * mayorDeEdad 5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI
 * EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota - 6)
 * HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena 7)
 * HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99 deTresEnTres
 *
 *
 * // DEFINO UN MÉTODO // DARLE UN NOMBRE - camelCase // ID la entrada - // ID
 * la salida -
 *
 * //pensar el los pasos en esapñol en psuedocódigo
 */
public class EjercicosBasicos {

	public static void main(String[] args) {
//		
//		boolean resultado = isIn("MALAGA", 'g');
//		resultado = isIn("MALAGA", 'g');
//
//		System.out.println(resultado);
//
		
		deTresEnTres();
		clasificarNota(5);// Si uso Scanner no necesito parametro
		
		
	}

//	 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
//	 * PERTENECE A LA CADENA O NO perteneceACadena 

//			public static void main(String[] args) 
//			{
//				
//			String letra = "a";
//			String cadena = "sardinas";
//			
//			if (cadena.indexOf(letra) !=1)
//			
//				System.out.println("No pertenece a la cadena");
//				
//			 else 
//				
//			
//				System.out.println("Pertenece a la cadena");
//			
//		}

	private static boolean isIn(String cadena, char car) {
		boolean in = true;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == car) {
				in = true;
			} else {
				in = false;
			}
		}
		return in;
	}

//	2) HACER UN MÉTODO QUE RECIBA UNA
//	 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
//	 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
//	 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
//	 * 
//	 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
//	

	private static int conatrCaracter(String texto, char caracter) {
		int posicion;
		int contador = 0;

		posicion = texto.indexOf(caracter);
		while (posicion != 1) {
			contador++;

			posicion = texto.indexOf(caracter, posicion + 1);
		}

		return contador;
	}

//	3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar

	public static boolean esPar(int numero) {
		boolean es_par = false;

		if (numero % 2 == 0) {
			es_par = true;

		} else {// Esto se puede eliminar

			es_par = false;

		}

		return es_par;
	}

//4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE
//	* EDAD O NO mayorDeEdad 

//	private static void mayorDeEdad(int edad) {
//
//		System.out.println("Diganos su edad: ");
//
//		// Static edad = new Scanner(System.in)
//		if (edad < 18) {
//
//			System.out.println("Usted es MENOR de edad.");
//
//		} else {
//
//			System.out.println("Usted es MAYOR de edad.");
//
//		}
//
//	}
	
	
	
	
	public static void mayorEdad ()
	{
		Scanner scanner = null;
		int edad = 0;
		String mensaje;
		
		
		
		scanner = new Scanner(System.in);
		System.out.println("Introduzca la edad");
		edad = scanner.nextInt();
		mensaje = (edad>=18) ? "Mayor edad" : "menor edad";
		System.out.println(mensaje);
		
	}
	
	
	
	
	
	

//	 5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA
//	 * SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota -

	private static void clasificarNota(int nota) {

		// Static nota = new Scanner(System.in)
		if (nota == 5) {
			System.out.println("Usted ha aprobado");

			if (nota == 6) {
				System.out.println("Usted tiene un BIEN");
			}
			if (nota == 10) {
				System.out.println("Enhorabuena tiene SOBRESALIENTE!!");
			}

			if (nota < 0 || nota > 10) {
				System.out.println("Upppsss!!!....Calificación incorrecta");
			}

		} else {

			System.out.println("Tiene que repetir la prueba!!");

		}

	}
	
	
	
	
	public static String traducirNota (int notaNumerica) {
		
		String notaAlfabetica = null;
		
		
		
		notaAlfabetica = switch (notaNumerica) {
		case 0,1,2,3 -> "Suspenso";
		case 5 -> "Aprobado";
		case 6 -> "Bien";
		case 7,8 -> "Notable";
		case 9,10 -> "Sobresaliente";
		default -> "ERROR";
		
	};
		
	
	return notaAlfabetica;
	
	}
	

	
	
	
	
	

// 6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena 

	private static String invertirCadena(String texto) {
//
//		StringBuilder miTexto = new StringBuilder(texto);
//
//		String invertida = miTexto.reverse().toString();
//
//		System.out.println("Texto invertido: " + invertida);
//		return invertida;

		
		String invertida = new StringBuilder(texto).reverse().toString();
		
		
		return invertida;
		
		
		
	}

	// * 7) HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99
	// deTresEnTres

	private static void deTresEnTres() {
		int num = 0;

		for (int i = 3; num < 100; num += 3) {

			System.out.println(num);
		}

		
	}
}
