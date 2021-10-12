import java.io.*;

public class comp2ej7 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new 

InputStreamReader(System.in));
		int a;
		int b;
		int i;
		String letra;
		String vector[];
		a = 0;
		b = 0;
		while (a>=b) {
			System.out.println("Primer número");
			a = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Segundo número");
			b = Integer.parseInt(bufEntrada.readLine());
			if (a>=b) {
				System.out.println("Ingrese nuevamente los numeros");
			}
		}
		vector = new String[b-a];
		for (i=a;i<=b-1;i++) {
			if ((i%6==0)) {
				vector[i-1] = "FizzBuzz";
			} else {
				if ((i%2==0)) {
					vector[i-1] = "Fizz";
				} else {
					if ((i%3==0)) {
						vector[i-1] = "Buzz";
					} else {
						vector[i-1] = Integer.toString(i);
					}
				}
			}
		}
		System.out.print("[");
		for (i=a;i<=b-1;i++) {
			System.out.print(vector[i-1]);
			if (i<=b-2) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println(" ");
		System.out.println("Presione cualquier tecla para continuar");
		letra = bufEntrada.readLine();
	}


}

