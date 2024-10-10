package core;

import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Juego> juegos;

    public Campeonato() {
        this.juegos = new ArrayList<>();
    }

    public boolean addJuego(Juego juego) {
        if (!this.juegos.contains(juego)) {
            this.juegos.add(juego);
            return true;
        }
        return false;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public Juego getJuego(int index) {
        return this.juegos.get(index);
    }

    public void showResumen() {
        System.out.println("------------- Resultados -------------\n");
        int controller = 0;
        for (Juego juego : this.juegos) {
            System.out.println("Jugador 1: " + juego.getJugador1().getNombre());
            System.out.println("Jugador 2: " + juego.getJugador2().getNombre());
            System.out.println("Juez: " + juego.getJuez().getNombre());
            int player1Count = 0, player2Count = 0, index = 1;
            for (Set set : juego.getSets()) {
                System.out.println("Set " + index + ": " + set.getPuntosJugador1() + " - " + set.getPuntosJugador2());
                index++;
                if (set.getPuntosJugador1() > set.getPuntosJugador2()) {
                    player1Count++;
                } else {
                    player2Count++;
                }
            }
            if (controller == (this.juegos.size() - 1)) {
                if (player1Count > player2Count) {
                    System.out.println("Ganador: " + juego.getJugador1().getNombre() + "\n");
                    System.out.println("El ganador del torneo es: " + juego.getJugador1().getNombre() + "\n");
                } else {
                    System.out.println("Ganador: " + juego.getJugador2().getNombre() + "\n");
                    System.out.println("El ganador del torneo es: " + juego.getJugador2().getNombre() + "\n");
                }
            } else {
                if (player1Count > player2Count) {
                    System.out.println("Ganador: " + juego.getJugador1().getNombre());
                } else {
                    System.out.println("Ganador: " + juego.getJugador2().getNombre());
                }
                System.out.println("");
            }
            controller++;
        }
    }

}
