import java.io.*;

public class comp1ej6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		int x;
		// Se desea una aplicación que solicite 2 números enteros
		// y realice la operación de potencia (sin uso de librerías).

		System.out.println("Ingrese la base");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el exponente");
		b = Integer.parseInt(bufEntrada.readLine());
		x = 1;
		for (c = 1; c <= b; c++) {
			x = x * a;
		}
		System.out.println(a + " elevado a " + b + " es: " + x);
	}

}
