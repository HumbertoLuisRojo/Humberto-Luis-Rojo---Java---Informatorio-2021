import java.io.*;
import java.math.*;

public class comp1ej2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		double div;
		int modulo;
		int mul;
		int r;
		int s;
		int ent_div;
		// Realizar un programa que solicite por consola 2 números enteros.
		// Para luego imprimir el resultado de la suma, resta, multiplicación,
		// división y módulo (resto de la división) de ambos números.
		// Definir div Como Real;
		System.out.println("Ingrese el primer operador");
		a = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el segundo operador");
		b = Integer.parseInt(bufEntrada.readLine());
		s = a + b;
		r = a - b;
		mul = a * b;
		div = Math.floor(a / b);
		ent_div = (int) div;
		modulo = a % b;
		System.out.println(a + " + " + b + " = " + s);
		System.out.println(a + " - " + b + " = " + r);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + ent_div);
		System.out.println(a + " % " + b + " = " + modulo);
	}

}
