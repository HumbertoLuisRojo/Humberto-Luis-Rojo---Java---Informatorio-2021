import java.io.*;

public class comp1ej4 {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int f;
		int i;
		int nro;
		int p;
		// Realizar un programa que calcule el factorial de un número:
		System.out.println("Ingrese un número");
		nro = Integer.parseInt(bufEntrada.readLine());
		if (nro == 0) {
			f = 1;
		} else {
			f = 1;
			for (i = 1; i <= nro; i++) {
				f = f * i;
			}
		}
		System.out.println("El factorial de " + nro + " es: " + f);
	}

}
