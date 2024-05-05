public class Ejercicio_01 {
    public static void main(String[] args) {

        JuegoDeLosChinos juego = new JuegoDeLosChinos(5); // 5 JUGADORES

        
        System.out.println("Jugadores antes de jugar:"); // MOSTRAMOS LOS JUGADORES
        for (Jugador jugador : juego.getJugadores()) {
            System.out.println(jugador);
        }

        
        juego.jugar(); //EMPIEZA EL JUEGO

        
        System.out.println("Resultado de la ronda:");
        System.out.println(juego.determinarGanadorRonda());

        System.out.println("Ganador del juego A:"); // GANADOR A
        System.out.println(juego.determinarGanadorJuegoA());

        System.out.println("Ganador del juego B:"); // GANADOR B
        System.out.println(juego.determinarGanadorJuegoB());
    }
}
