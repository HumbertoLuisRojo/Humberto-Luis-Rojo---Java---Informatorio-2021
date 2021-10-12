
import java.util.*;

public class Empleados {

	public static void main(String[] args) {

		HashSet<Empleado> empleado = new HashSet<>();
		HashMap<Integer, Float> sueldo = new HashMap<>();

		empleado.add(new Empleado("Carlos Rolón", 11111111, 50, 100));
		empleado.add(new Empleado("Juan Pérez", 22222222, 80, 50));
		empleado.add(new Empleado("José Gómez", 33333333, 60, 70));
		empleado.add(new Empleado("Mario Ponce", 44444444, 60, 50));
		empleado.add(new Empleado("Raúl Miño", 55555555, 100, 40));

		System.out.println("\nEste programa calculará el sueldo de los siguientes empleados:\n");

		for (Empleado lista : empleado) {
			System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas trabajadas: " + lista.horasTrabajadas
					+ " - Valor hora: " + lista.valorHora);
		}

		for (Empleado creartabla : empleado) {
			sueldo.put(creartabla.clave(), creartabla.valor());
		}
		System.out.println("\nLiquidación de sueldos:\n");
		sueldo.forEach((dni, valor) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + valor));
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