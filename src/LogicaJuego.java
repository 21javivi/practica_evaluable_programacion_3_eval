import java.util.Scanner;

public class LogicaJuego {
	// ATRIBUTOS
	int numeroSecreto;

	// CONSTRUCTORES
	public LogicaJuego(int numeroSecreto) {

		this.numeroSecreto = numeroSecreto;

	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public String comaparaCon() {
		Scanner sc = new Scanner(System.in);
		int numeroIntentos = 10;
		String resultadoFinal = "";
		int numeroSecreto = this.numeroSecreto;
		boolean yaGanado = false;
		String numeroSecretoCadena = Integer.toString(numeroSecreto);

		do {
			boolean todosIguales = true;
			resultadoFinal = "";

			System.out.println("Introduce un numero de " + numeroSecretoCadena.length() + " cifras: (Te quedan "
					+ numeroIntentos + " intentos)");
			int numeroIntroducido = sc.nextInt();
			String numeroComoCadena = Integer.toString(numeroIntroducido);

			if (numeroComoCadena.length() != numeroSecretoCadena.length()) {
				throw new IllegalArgumentException("El número introducido no tiene la longitud correcta");
			}

			for (int i = 0; i < numeroSecretoCadena.length(); i++) {
				if (numeroSecretoCadena.charAt(i) == numeroComoCadena.charAt(i)) {
					resultadoFinal += "☀️";
				} else {
					resultadoFinal += "🌙";
					todosIguales = false;
				}
			}
			if (yaGanado) {
				resultadoFinal = "Ya has ganado";
			}
			if (todosIguales && !yaGanado) {
				resultadoFinal = "Has ganado";
				yaGanado = true;

			}
			System.out.println(resultadoFinal);
			numeroIntentos--;
		} while (numeroIntentos > 0);

		if (numeroIntentos <= 0) {
			resultadoFinal = "Has superado el numero de intentos";
		}

		return resultadoFinal;

	}

	@Override
	public String toString() {
		return "LogicaJuego [numeroSecreto=" + numeroSecreto + "]";
	}
}
