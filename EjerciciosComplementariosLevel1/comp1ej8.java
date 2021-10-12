import java.io.*;

public class comp1ej8 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String ciudad;
		String dire;
		String edad;
		String nya;
		// Crear una aplicación que solicite de entrada los datos de una persona en este
		// orden:
		// Nombre y Apellido
		// Edad
		// Dirección
		// Ciudad
		// Luego imprimirá el siguiente mensaje:
		// {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
		System.out.println("Ingrese nombre y apellido");
		nya = bufEntrada.readLine();
		System.out.println("Ingrese edad");
		edad = bufEntrada.readLine();
		System.out.println("Ingrese dirección");
		dire = bufEntrada.readLine();
		System.out.println("Ingrese ciudad");
		ciudad = bufEntrada.readLine();
		System.out.println(ciudad + " - " + dire + " - " + edad + " - " + nya);
	}

}
