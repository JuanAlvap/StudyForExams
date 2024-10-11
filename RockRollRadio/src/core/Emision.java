package core;

import java.util.ArrayList;

public class Emision {

    private static int ID = 0;
    
    private int serial;
    private ArrayList<Cancion> canciones;
    private ArrayList<Invitado> invitados;
    private Programa programa;

    public Emision(Programa programa) {
        this.programa = programa;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.serial = Emision.ID;
        
        this.programa.addEmision(this);
        
        Emision.ID++;
    }

    public boolean addCancion(Cancion cancion) {
        if (!this.canciones.contains(cancion)) {
            this.canciones.add(cancion);
            return true;
        }
        return false;
    }

    public boolean addInvitado(Invitado inv) {
        if (!this.invitados.contains(inv)) {
            this.invitados.add(inv);
            return true;
        }
        return false;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

}
