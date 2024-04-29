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
		int numeroIntentos = 0;
		String resultadoFinal = "";

		int numeroSecreto = this.numeroSecreto;

		String numeroSecretoCadena = Integer.toString(numeroSecreto);
		char numeroSecretoChar[] = numeroSecretoCadena.toCharArray();

		do {
			boolean todosIguales = true;
			resultadoFinal = "";

			System.out.println("Introduce un numero de 5 cifras:");
			int numeroIntroducido = sc.nextInt();
			String numeroComoCadena = Integer.toString(numeroIntroducido);
			char numeroJugado[] = numeroComoCadena.toCharArray();

			for (int i = 0; i < 5; i++) {
				if (numeroSecretoChar[i] == numeroJugado[i]) {
					resultadoFinal += "☀️";
				} else {
					resultadoFinal += "🌙";
					todosIguales = false;
				}
			}

			if (todosIguales) {
				resultadoFinal = "Has ganado";
				break;
			}
			System.out.println(resultadoFinal);
			numeroIntentos++;
		} while (numeroIntentos < 10);

		if (numeroIntentos >= 10) {
			resultadoFinal = "Has superado el numero de intentos";
		}

		return resultadoFinal;
	}

	@Override
	public String toString() {
		return "LogicaJuego [numeroSecreto=" + numeroSecreto + "]";
	}
}
