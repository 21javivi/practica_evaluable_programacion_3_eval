import java.util.*;

public class JuegoDeLosChinos extends Jugador {
	// ATRIBUTOS
	private ArrayList<Jugador> jugadores;

	// CONSTRUCTORES
	public JuegoDeLosChinos() {
		this.jugadores = new ArrayList<Jugador>();
	}

	// GETTERS Y SETTERS

	// METODOS DE LA CLASE
	public void jugar(int saca, int apuesta) {
		this.saca = saca;
		this.apuesta = apuesta;
	}
}
