import java.io.*;

public class comp1ej5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		int p;
		// Se desea una aplicación que solicite 2 números enteros y realice la operación
		// de multiplicación por sumas sucesivas (sin uso de librerías).

		System.out.println("Ingrese el primer operador");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el segundo operador");
		b = Integer.parseInt(bufEntrada.readLine());
		p = 0;
		for (c = 1; c <= b; c++) {
			p = p + a;
		}
		System.out.println("El producto entre " + a + " y " + b + " es: " + p);
	}

}
