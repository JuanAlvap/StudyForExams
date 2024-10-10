package core;

import java.util.ArrayList;

public class Juego {

    private Jugador jugador1;
    private Jugador jugador2;
    private Juez juez;
    private Juego juegoPrevio1;
    private Juego juegoPrevio2;
    private Juego juegoSiguiente;
    private ArrayList<Set> sets;

    public Juego(Jugador jugador1, Jugador jugador2, Juez juez) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.juez = juez;
        this.juegoPrevio1 = null;
        this.juegoPrevio2 = null;
        this.juegoSiguiente = null;
        this.sets = new ArrayList<>();

        this.juez.addJuego(this);
        this.jugador1.addJuego(this);
        this.jugador2.addJuego(this);
    }

    public Juego(Juego juegoPrevio1, Juego juegoPrevio2, Juez juez) {
        this.juegoPrevio1 = juegoPrevio1;
        this.juegoPrevio2 = juegoPrevio2;
        this.juez = juez;
        this.jugador1 = juegoPrevio1.getWinner();
        this.jugador2 = juegoPrevio2.getWinner();
        this.sets = new ArrayList<>();

        this.juegoPrevio1.setJuegoSiguiente(this);
        this.juegoPrevio2.setJuegoSiguiente(this);

        this.juez.addJuego(this);
        this.jugador1.addJuego(this);
        this.jugador2.addJuego(this);
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Juez getJuez() {
        return juez;
    }

    public ArrayList<Set> getSets() {
        return sets;
    }

    public void setJuegoSiguiente(Juego juegoSiguiente) {
        this.juegoSiguiente = juegoSiguiente;
    }

    public boolean addSets(Set set1, Set set2, Set set3) {
        if (!this.sets.contains(set1) || !this.sets.contains(set2) || !this.sets.contains(set3)) {
            if (!this.sets.contains(set1) && !this.sets.contains(set2) && !this.sets.contains(set3)) {
                this.sets.add(set1);
                this.sets.add(set2);
                this.sets.add(set3);
            } else if (!this.sets.contains(set1) && !this.sets.contains(set2)) {
                this.sets.add(set1);
                this.sets.add(set2);
            } else if (!this.sets.contains(set1) && !this.sets.contains(set3)) {
                this.sets.add(set1);
                this.sets.add(set3);
            } else if (!this.sets.contains(set2) && !this.sets.contains(set3)) {
                this.sets.add(set2);
                this.sets.add(set3);
            } else if (!this.sets.contains(set1)) {
                this.sets.add(set1);
            } else if (!this.sets.contains(set2)) {
                this.sets.add(set2);
            } else if (!this.sets.contains(set3)) {
                this.sets.add(set3);
            }
            return true;
        }
        return false;
    }

    public boolean addSets(Set set1, Set set2) {
        if (!this.sets.contains(set1) || !this.sets.contains(set2)) {
            if (!this.sets.contains(set1) && !this.sets.contains(set2)) {
                this.sets.add(set1);
                this.sets.add(set2);
            } else if (!this.sets.contains(set1)) {
                this.sets.add(set1);
            } else if (!this.sets.contains(set2)) {
                this.sets.add(set2);
            }
            return true;
        }
        return false;
    }

    public Jugador getWinner() {
        int player1Count = 0, player2Count = 0;
        for (Set set : this.sets) {
            if (set.getPuntosJugador1() > set.getPuntosJugador2()) {
                player1Count++;
            } else {
                player2Count++;
            }
        }
        if (player1Count > player2Count) {
            return this.jugador1;
        } 
        return this.jugador2;
    }

}
