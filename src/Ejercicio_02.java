public class Ejercicio_02 {

	public static void main(String[] args) {

		LogicaJuego juego1 = new LogicaJuego((int) (Math.random() * 100000));

		System.out.println(juego1);

		System.out.println(juego1.comaparaCon());

	}

}
