package examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Número que nos van a introducir por teclado
		int numero;
		
		// Contador de cifras pares
		int numPares = 0;
		
		// Contador de cifras impares
		int numImpares = 0;
		
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero positivo");
		numero = lectura.nextInt();
		
		// Si el número es 0 tiene una cifra par
		if(numero == 0) {
			System.out.println("Tiene una cifra par");
		} else if (numero<0) {
			// Si el número es negativo muestro un error
			System.out.println("ERROR: Tiene que ser positivo");
		} else {
			// Mientras sea distinto de 0 significa que el número sigue teniendo cifras
			while(numero!=0) {
				// Si el número es par
				if(numero%2==0) {
					numPares++;
				} else {
					// Si el número es impar
					numImpares++;
				}
				// Le quito la última cifra al número
				numero = numero/10;
			}
			
			// Imprimimos resultado
			System.out.println("El número tiene " + numPares + " cifras pares.");
			System.out.println("El número tiene " + numImpares + " cifras impares.");
		}
		
		// Cerramos Scanner
		lectura.close();
	}

}
