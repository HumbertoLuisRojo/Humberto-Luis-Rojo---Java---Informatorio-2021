import java.io.*;

public class comp1ej1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		// Solicitar por consola el nombre del usuario e imprimir por pantalla
		// el siguiente mensaje "HOLA {USUARIO}!!!""
		System.out.println("Ingrese nombre de usuario");
		nombre = bufEntrada.readLine();
		System.out.println("Hola " + nombre);
	}

}
