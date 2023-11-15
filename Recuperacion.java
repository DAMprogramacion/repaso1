/*
 * Recuperacion.java
 * 1. MÉTODO QUE SE LE PASA UN Nº Y TE DICE EL Nº DE DIGITOS, ACOTAMOS DE 0 a 1000 exclusive
 * EJEMPLO: 7: un digito, 15: dos digitos, 455: tres dígitos
 * 2. MÉTODO QUE SE LE PASA TRES LADOS (int) Y NOS DIGA LA DESIGUALDAD TRIANGULAR: la suma
 * de dos lados debe ser mayor que la del otro lado
 * 3. MÉTODO QUE SE PASAMOS TRES CARACTERES Y MUESTRA LA CADENA, EJEMPLO:
 *  a b c   Muestra abc
 */
import java.util.Random;

public class Recuperacion {
	
	public static void main (String[] args) {
		int numero = new Random().nextInt(1_000);
		int numeroDigitos = calcularDigitosDe0A1000(numero);
		System.out.printf("%d tiene %d cifras%n", numero, numeroDigitos);
		int lado1, lado2, lado3;
		for (int i = 0; i < 20; i++) {
			lado1 = new Random().nextInt(10) + 1;
			lado2 = new Random().nextInt(10) + 1;
			lado3 = new Random().nextInt(10) + 1;
			boolean esTriangulo = comprobarDesigualdadTriangular(lado1, lado2, lado3);
			System.out.printf("¿Es un triángulo con los lados %d %d %d? %B%n", 
					lado1, lado2, lado3, esTriangulo);
			if (esTriangulo) 
			    mostrarTipoTriangulo(lado1, lado2, lado3);			
		}
		mostarCadenas('a', 'b', 'c');
	}
	
	
	public static int calcularDigitosDe0A1000(int numero) {
		//código
		if (numero >= 0 && numero < 10)
			return 1;
		else if (numero >= 10 && numero < 100) 	
			return 2;
		else
			return 3;
	}
	
	public static boolean comprobarDesigualdadTriangular(int lado1, int lado2, int lado3) {
		return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) 
					&& (lado3 + lado2 > lado1);
	}
	public static void mostrarTipoTriangulo(int lado1, int lado2, int lado3) {
		
		if (lado1 == lado2 && lado1 == lado3)
			System.out.println("TRIÁNGULO EQUILATERO");
		else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2)
				   || (lado2 == lado3 && lado2 != lado1))
			System.out.println("TRIÁNGULO ISÓSCELES");
		else 
			System.out.println("TRIÁNGULO ESCALENO");
 	
	}
	public static void mostarCadenas(char a, char b,  char c) {
		System.out.printf("%c%c%c%n", a, b, c); 
		System.out.println("" +  a + b + c);
	}	
}

