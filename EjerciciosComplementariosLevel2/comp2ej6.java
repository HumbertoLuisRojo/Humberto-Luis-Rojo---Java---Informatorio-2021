
import java.util.*;

public class comp2ej6 {

	public static void main(String[] args) {

		HashSet<Empleado> empleado = new HashSet<>();
		HashMap<Integer, Float> sueldo = new HashMap<>();

		empleado.add(new Empleado("Tinky Winky", 1234567, 48, 250));
		empleado.add(new Empleado("Dipsy", 7654321, 55, 150));
		empleado.add(new Empleado("Laa-Laa", 12321000, 57, 120));
		empleado.add(new Empleado("Po", 20203030, 60, 50));
		empleado.add(new Empleado("Clark Kent", 987654321, 40, 88));

		System.out.println("\nN�mina de empleados:\n");

		for (Empleado lista : empleado) {
			System.out.println("  nombre " + lista.nombre + "  dni " + lista.dni + "  Horas que trabaj�: "
					+ lista.horasTrabajadas + "  costo de la hora: " + lista.valorHora);
		}

		for (Empleado creartabla : empleado) {
			sueldo.put(creartabla.clave(), creartabla.valor());
		}
		System.out.println("\nListado de sueldo:\n");
		sueldo.forEach((dni, valor) -> System.out.println("dni: " + dni + "  sueldo: " + valor));
	}
}

class Empleado {
	String nombre;
	int dni;
	float horasTrabajadas;
	float valorHora;

	public Empleado(String nombre, int dni, float horasTrabajadas, float valorHora) {
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.valorHora = valorHora;
	}

	public int clave() {
		return this.dni;
	}

	public float valor() {
		return this.horasTrabajadas * this.valorHora;
	}
}