import java.io.*;

public class comp2ej5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int h;
		int horas[];
		int i;
		double p;
		double peso[];
		double total[];
		double total_final;
		// Dados 2 ArrayList que contienen horas-trabajadas (array1) y
		// valor-por-hora(array2) del resumen de carga de horas semanal
		// de un empleado. Se debe generar otra lista que contenga
		// los totales y luego imprimir el total final a cobrar.
		horas = new int[5];
		peso = new double[5];
		total = new double[5];
		total_final = 0;
		for (i = 1; i <= 5; i++) {
			System.out.println("Ingrese las horas trabajadas del día " + i);
			h = Integer.parseInt(bufEntrada.readLine());
			horas[i - 1] = h;
		}
		System.out.println(" ");
		for (i = 1; i <= 5; i++) {
			System.out.println("Ingrese el costo del trabajo del día " + i);
			p = Double.parseDouble(bufEntrada.readLine());
			peso[i - 1] = p;
		}
		System.out.println(" ");
		for (i = 1; i <= 5; i++) {
			total[i - 1] = horas[i - 1] * peso[i - 1];
			System.out.println("El total del trabajo del día " + i + " es: " + total[i - 1]);
			total_final = total_final + total[i - 1];
		}
		System.out.println(" ");
		System.out.println("El total final es: $" + total_final);
	}

}
