import java.io.*;
import java.math.*;

public class comp2ej3 {

	public static void main(String args[]) {
		int a;
		int baraja[];
		int baraja_des[];
		int i;
		int testigo[];
		double R;
		int val;

		// Crear una lista que contenga como elementos la numeración de cartas de una
		// baraja francesa (solo los valores, no figuras).
		// Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso
		// (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

		baraja = new int[13];
		baraja_des = new int[13];
		testigo = new int[13];
		for (i = 1; i <= 13; i++) {
			baraja[i - 1] = i;
		}
		// Orden creciente
		System.out.println(" ");
		System.out.println("Orden creciente");
		for (i = 1; i <= 13; i++) {
			System.out.println(baraja[i - 1]);
		}
		System.out.println(" ");
		// Orden decreciente
		System.out.println("Orden decreciente");
		for (i = 13; i >= 1; i--) {
			System.out.println(baraja[i - 1]);
		}
		System.out.println(" ");
		for (i = 1; i <= 13; i++) {
			testigo[i - 1] = 0;
		}
		// Desordenado
		System.out.println("Desordenado");
		for (i = 1; i <= 13; i++) {
			R = Math.floor(Math.random() * 13) + 1;
			a = (int) R;
			if (testigo[a - 1] == 0) {
				testigo[a - 1] = 1;
				baraja_des[i - 1] = baraja[a - 1];
			} else {
				i = i - 1;
			}
		}
		for (i = 1; i <= 13; i++) {
			System.out.println(baraja_des[i - 1]);
		}
	}

}
