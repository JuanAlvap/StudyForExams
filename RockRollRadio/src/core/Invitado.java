package core;

import java.util.ArrayList;

public class Invitado extends Persona {

    private ArrayList<Emision> emisiones;

    public Invitado(String nombre) {
        super(nombre);
        this.emisiones = new ArrayList<>();
    }

    public boolean addEmision(Emision emision) {
        if (!this.emisiones.contains(emision)) {
            this.emisiones.add(emision);
            return true;
        }
        return false;
    }
}
