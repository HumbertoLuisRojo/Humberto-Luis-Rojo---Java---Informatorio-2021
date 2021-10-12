import java.io.*;

public class comp2ej1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cc;
		String ciudad;
		String ciudad_carga[];
		String condicion;
		int i;
		int num;
		int tamanio;
		// int tama�o;
		String vector_ciudad[];

		// Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
		// luego imprimir por pantalla el ranking

		// Declaramos variables
		tamanio = 100;
		// Definimos el array
		ciudad_carga = new String[tamanio];
		System.out.println("Ingresamos una ciudad? (s/n)");
		condicion = bufEntrada.readLine();
		cc = 1;
		// Asignamos valores
		while (condicion.equals("s") && cc <= tamanio) {
			System.out.println("Su ciudad favorita es...");
			ciudad = bufEntrada.readLine();
			ciudad_carga[cc - 1] = ciudad;
			cc = cc + 1;
			System.out.println("Ingresamos una ciudad? (s/n)");
			condicion = bufEntrada.readLine();
		}
		vector_ciudad = new String[cc - 1];
		for (i = 1; i <= (cc - 1); i++) {
			vector_ciudad[i - 1] = ciudad_carga[i - 1];
		}
		// Recorremos el array y mostramos su contenido
		for (i = 1; i <= (cc - 1); i++) {
			System.out.println("#" + i + "-" + vector_ciudad[i - 1]);
		}
	}

}
