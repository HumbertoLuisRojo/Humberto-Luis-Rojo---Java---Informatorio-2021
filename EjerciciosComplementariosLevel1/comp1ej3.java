import java.io.*;

public class comp1ej3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int entrada;
		int i;
		int j;
		// Confeccionar un programa que dado un número entero
		// como dato de entrada imprima la secuencia de números
		// (incrementos de 1) de la siguiente forma:
		// Entrada: 5
		// Salida:
		// 1
		// 12
		// 123
		// 1234
		// 12345
		System.out.println("Ingrese un valor entero");
		entrada = Integer.parseInt(bufEntrada.readLine());
		for (i = 1; i <= entrada; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
