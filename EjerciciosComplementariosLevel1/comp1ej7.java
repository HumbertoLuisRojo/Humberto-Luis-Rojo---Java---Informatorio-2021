import java.io.*;

public class comp1ej7 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String frase;
		String frase_salida;
		int i;
		String letra;
		// double longitud{frase};
		String salida;
		System.out.println("Ingrese una frase en minúsculas");
		frase = bufEntrada.readLine();
		// Realizar un programa que dado un String de entrada en minúsculas
		// y lo convierta por completo a mayúsculas.
		// Sin uso de métodos o librerías que realicen toUppercase().

		salida = "";
		frase_salida = "";
		for (i = 1; i <= frase.length(); i++) {
			letra = frase.substring(i - 1, i);
			switch (letra) {
				case "a":
					salida = "A";
					break;
				case "b":
					salida = "B";
					break;
				case "c":
					salida = "C";
					break;
				case "d":
					salida = "D";
					break;
				case "e":
					salida = "E";
					break;
				case "f":
					salida = "F";
					break;
				case "g":
					salida = "G";
					break;
				case "h":
					salida = "H";
					break;
				case "i":
					salida = "I";
					break;
				case "j":
					salida = "J";
					break;
				case "k":
					salida = "K";
					break;
				case "l":
					salida = "L";
					break;
				case "m":
					salida = "M";
					break;
				case "n":
					salida = "N";
					break;
				case "�":
					salida = "�";
					break;
				case "o":
					salida = "O";
					break;
				case "p":
					salida = "P";
					break;
				case "q":
					salida = "Q";
					break;
				case "r":
					salida = "R";
					break;
				case "s":
					salida = "S";
					break;
				case "t":
					salida = "T";
					break;
				case "u":
					salida = "U";
					break;
				case "v":
					salida = "V";
					break;
				case "w":
					salida = "W";
					break;
				case "x":
					salida = "X";
					break;
				case "y":
					salida = "Y";
					break;
				case "z":
					salida = "Z";
					break;
			}
			frase_salida = frase_salida + salida;
		}
		System.out.println("La frase en mayúsculas es: " + frase_salida);
	}

}
