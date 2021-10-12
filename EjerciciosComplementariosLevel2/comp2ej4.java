import java.io.*;

public class comp2ej4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String elemento;
		int i;
		String nombre[];
		String nombre1[];
		String nombre2[];
		String nombre3[];

		// Cargar un arrayList con 12 nombres de estudiantes (String),
		// luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

		nombre = new String[12];
		nombre1 = new String[4];
		nombre2 = new String[4];
		nombre3 = new String[4];
		for (i = 1; i <= 12; i++) {
			System.out.println("Ingrese el elemento " + i);
			elemento = bufEntrada.readLine();
			nombre[i - 1] = elemento;
		}
		System.out.println(" ");
		for (i = 1; i <= 12; i++) {
			if (i <= 4) {
				nombre1[i - 1] = nombre[i - 1];
			} else {
				if (i <= 8) {
					nombre2[i - 5] = nombre[i - 1];
				} else {
					nombre3[i - 9] = nombre[i - 1];
				}
			}
		}
		System.out.println("Primer curso");
		for (i = 1; i <= 4; i++) {
			System.out.println("El alumno " + i + " es: " + nombre1[i - 1]);
		}
		System.out.println(" ");
		System.out.println("Segundo curso");
		for (i = 1; i <= 4; i++) {
			System.out.println("El alumno " + i + " es: " + nombre2[i - 1]);
		}
		System.out.println(" ");
		System.out.println("Tercer curso");
		for (i = 1; i <= 4; i++) {
			System.out.println("El alumno " + i + " es: " + nombre3[i - 1]);
		}
	}

}
