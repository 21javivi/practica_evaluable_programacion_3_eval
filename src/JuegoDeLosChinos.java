import java.util.*;

public class JuegoDeLosChinos extends Jugador {
	// ATRIBUTOS
	private ArrayList<Jugador> jugadores;

	// CONSTRUCTORES
	public JuegoDeLosChinos() {
		this.jugadores = new ArrayList<Jugador>();

		String nombres[] = { "Juan", "Isabel", "Jose Maria", "Natalia", "Mauri", "Fernando", "Lucia", "Carlos",
				"Roberto", "Yago", "Rafael", "Maria Jesus", "Belén", "Carmen", "Ana", "Bea", "Ezequiel", "Concha",
				"Vicenta", "Marisa", "Emilio", "Mariano", "Valentin", "Andres", "Pablo","Alex","Paloma" };
	
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public void jugar(int saca, int apuesta) {
		this.saca = saca;
		this.apuesta = apuesta;
	}

	public String determinarGanadorRonda() {
		String nombreGanador = " ";

		return nombreGanador;

	}
}
