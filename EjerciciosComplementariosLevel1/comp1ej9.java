import java.io.*;

public class comp1ej9 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String busca;
		int cl;
		String frase;
		int i;
		String letra;
		// double longitud{frase};
		// Dado un String de entrada (frase, texto, etc)
		// calcular la cantidad de veces que aparece una letra dada
		System.out.println("Ingrese una frase");
		frase = bufEntrada.readLine();
		System.out.println("Buscar la letra ");
		busca = bufEntrada.readLine();
		cl = 0;
		for (i = 1; i <= frase.length(); i++) {
			letra = frase.substring(i - 1, i);
			if (letra.equals(busca)) {
				cl = cl + 1;
			}
		}
		System.out.println("la letra ''" + busca + "'' aparece " + cl + " veces.");
	}

}
