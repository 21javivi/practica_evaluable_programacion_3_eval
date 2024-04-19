
public class Jugador {
	// ATRIBUTOS
	String nombre;
	int saca;
	int apuesta;
	int numGanadas;

	// CONSTRUCTORES
	public Jugador() {

	}

	public Jugador(String nombre, int saca, int apuesta, int numGanadas) {
		this.nombre = nombre;
		this.saca = saca;
		this.apuesta = apuesta;
		this.numGanadas = numGanadas;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaca() {
		return saca;
	}

	public void setSaca(int saca) {
		this.saca = saca;
	}

	public int getApuesta() {
		return apuesta;
	}

	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}

	public int getNumGanadas() {
		return numGanadas;
	}

	public void setNumGanadas(int numGanadas) {
		this.numGanadas = numGanadas;
	}

	// METDOS DE LA CLASE
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", saca=" + saca + ", apuesta=" + apuesta + ", numGanadas=" + numGanadas
				+ "]";
	}
	
    public int compareTo(Jugador otroJugador) {
        return this.nombre.compareTo(otroJugador.nombre);
    }
	
}
