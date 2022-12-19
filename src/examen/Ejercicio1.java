package examen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Lado del cuadrado
		int lado;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el tamaño del cuadrado
		System.out.println("Introduzca el tamaño del cuadrado:");
		lado = sc.nextInt();

		// Compruebo que me han introducido un valor válido
		if (lado >= 1) {
			for (int i = 1; i <= lado; i++) {
				// Si estamos en la primera o en la última fila imprimo una fila de *
				if (i == 1 || i == lado) {
					for (int j = 1; j <= lado; j++) {
						System.out.print("*");
					}
				} else {
					// En cualquier otro caso tengo que imprimir * seguido de espacios
					// y terminado en *
					System.out.print("*");
					for (int j = 2; j < lado; j++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("ERROR: El número tiene que ser mayor que 0");
		}

		sc.close();
	}
}
