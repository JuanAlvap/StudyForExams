package core;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class LigaTenis {

    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;

    public LigaTenis() {
        this.campeonatos = new ArrayList<>();
        this.jueces = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }
    
    public boolean addJuez(Juez juez){
        if(!this.jueces.contains(juez)){
            this.jueces.add(juez);
            return true;
        }
        return false;
    }
    
    public boolean addJugador(Jugador jugador){
        if(!this.jugadores.contains(jugador)){
            this.jugadores.add(jugador);
            return true;
        }
        return false;
    }
    
    public boolean addCampeonato(Campeonato campeonato){
        if (!this.campeonatos.contains(campeonato)){
            this.campeonatos.add(campeonato);
            return true;
        }
        return false;
    }
    
    public Campeonato getCampeonato(int index){
        return this.campeonatos.get(index);
    }
    
    public Jugador getJugador(int index){
        return this.jugadores.get(index);
    }
    
    public Juez getJuez(int index){
        return this.jueces.get(index);
    }
    
    public void calcSetsGanadosJugadoresCampeonato(int index){
        Campeonato campeonato = getCampeonato(index);
        LinkedHashMap<String, Integer> jugadores = new LinkedHashMap<String, Integer>();
        for (Juego juego : campeonato.getJuegos()) {
            if (!jugadores.containsKey(juego.getJugador1().getNombre())&&!jugadores.containsKey(juego.getJugador2().getNombre())){
                jugadores.put(juego.getJugador1().getNombre(), 0);
                jugadores.put(juego.getJugador2().getNombre(), 0);
            }else if(!jugadores.containsKey(juego.getJugador1().getNombre())){
                jugadores.put(juego.getJugador1().getNombre(), 0);
            }else if (!jugadores.containsKey(juego.getJugador2().getNombre())){
                jugadores.put(juego.getJugador2().getNombre(), 0);
            }
        }
        for (Juego juego : campeonato.getJuegos()) {
            for (Set set : juego.getSets()) {
                if (set.getPuntosJugador1()>set.getPuntosJugador2()){
                    jugadores.replace(juego.getJugador1().getNombre(), (jugadores.get(juego.getJugador1().getNombre()))+1);
                }else{
                    jugadores.replace(juego.getJugador2().getNombre(), (jugadores.get(juego.getJugador2().getNombre()))+1);
                }
            }
        }
        jugadores.forEach((k,v) -> {System.out.println("El jugador: "+ k + " gano "+ v + " sets en el campeonato");});
    }
    
}
