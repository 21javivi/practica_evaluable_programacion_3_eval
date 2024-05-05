import java.util.*;

public class JuegoDeLosChinos {
	// ATRIBUTOS
	private ArrayList<Jugador> jugadores;

	// CONSTRUCTORES
	public JuegoDeLosChinos(int nJugadores) {
		this.jugadores = new ArrayList<Jugador>(nJugadores);

		String nombres[] = { "Juan", "Isabel", "Jose Maria", "Natalia", "Mauri", "Fernando", "Lucia", "Carlos",
				"Roberto", "Yago", "Rafael", "Maria Jesus", "Belén", "Carmen", "Ana", "Bea", "Ezequiel", "Concha",
				"Vicenta", "Marisa", "Emilio", "Mariano", "Valentin", "Andres", "Pablo", "Alex", "Paloma" };

		for (int i = 0; i < nJugadores; i++) {
			String nombre = nombres[(int) (Math.random() * nombres.length)];
			Jugador jugador = new Jugador(nombre, 0, 0, 0);
			jugadores.add(jugador);
		}

	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public void jugar() {
		Scanner scanner = new Scanner(System.in);

		for (Jugador jugador : jugadores) {
			System.out.println("Turno de " + jugador.getNombre());
			System.out.print("¿Cuántos chinos sacas? ");
			int saca = scanner.nextInt();
			jugador.setSaca(saca);

			System.out.print("¿Cuál es tu apuesta? ");
			int apuesta = scanner.nextInt();
			jugador.setApuesta(apuesta);
		}

	}

	public String determinarGanadorRonda() {
		int sumaTotal = 0;
		for (Jugador jugador : jugadores) {
			sumaTotal += jugador.getSaca();
		}

		Jugador ganador = null;
		int diferenciaMinima = sumaTotal;

		for (Jugador jugador : jugadores) {
			int diferencia = sumaTotal - jugador.getApuesta();
			if (diferencia >= 0 && diferencia < diferenciaMinima) {
				diferenciaMinima = diferencia;
				ganador = jugador;
			}
		}

		ArrayList<String> jugadoresRestantes = new ArrayList<>(); // LISTA JUGADORES SIN EL GANADOR
		for (Jugador jugador : jugadores) {
			if (jugador != ganador) {
				jugadoresRestantes.add(jugador.getNombre());
			}
		}

		Collections.sort(jugadoresRestantes);

		String resultado = "El ganador de la ronda es: " + ganador.getNombre() + "\n";
		for (String nombre : jugadoresRestantes) {
			resultado += nombre + "\n";
		}

		return "Jugadores restantes: " + resultado;
	}

	public String determinarGanadorJuegoA() {
		return "Pierde: " + jugadores;
	}

	public String determinarGanadorJuegoB() {

		Comparator<Jugador> comparador = new Comparator<Jugador>() {

			@Override
			public int compare(Jugador jugador1, Jugador jugador2) {

				int comparacion = Integer.compare(jugador2.getNumGanadas(), jugador1.getNumGanadas()); // COMPARA
																										// PUNTUACIONES

				if (comparacion == 0) { // SI HAY EMPATE
					comparacion = jugador1.getNombre().compareTo(jugador2.getNombre()); // COMPARA LOS NOMBRES
																						// ALFABETICAMENTE
				}
				return comparacion;
			}
		};

		Collections.sort(jugadores, comparador); // ORDENA POR LA COMPARACION

		Jugador primero = jugadores.get(0);
		Jugador segundo = jugadores.get(1);
		Jugador tercero = jugadores.get(2);

		return "El podio es el siguiente: \n Primero: " + primero + "\n Segundo: " + segundo + "\n Tercero: " + tercero;

	}

	public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }



}
