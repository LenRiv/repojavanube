




import java.util.Scanner;

/**
 * 
 * 
 * INFORME DE INDICE CORPORAL
 * 
 * 
 * 
 * */




public class TuInforme {
	
	public static void main(String[] args) {
		
		
		
		Scanner informe = new Scanner (System.in);

		System.out.println("Ingrese su peso");

		float peso = informe.nextFloat();

		System.out.println("Ingrese su estatura: ");

		float estatura = informe.nextFloat();
		 
	Persona paciente1 = new Persona( peso, estatura);
		
		
		System.out.println(paciente1.getPeso() + paciente1.getEstatura());
		
		/**
		 * 
		 * FORMULA:
		 * 
		 * IMC = PESOKG/ESTATURA AL CUADRADO(METROS)
		 * 
		 * 
		 * 
		 * Si IMC < 16->> su imc es DESNUTRIDO
		 * 
		 * Si IMC >=16 Y <18 ->> su imc es DELGADO
		 * 
		 * Si IMC >=18 Y < 25 ->> su imc es IDEAL
		 * 
		 * Si IMC >=25 Y <31 ->> su imc es SOBREPESO
		 * 
		 * Si IMC >=31 ->> su imc es OBESO
		 * 
		 * 
		 * ADEMÁS, DE DECIRLE SU IMC NUMÉRICO Y NOMINAL
		 * 
		 * */
		
		
		
		
		
		

		
		
		
		
		
		
	}
}
