package core;

import java.util.ArrayList;

public class Locutor extends Persona {

    private ArrayList<Programa> programas;

    public Locutor(String nombre) {
        super(nombre);
        this.programas = new ArrayList<>();
    }

    public boolean addPrograma(Programa programa) {
        if (!this.programas.contains(programa)) {
            this.programas.add(programa);
            return true;
        }
        return false;
    }

}
