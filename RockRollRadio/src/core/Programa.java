package core;

import java.util.ArrayList;

public class Programa {

    private static int ID = 0;

    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;

    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        this.locutores = new ArrayList<>();
        this.serial = Programa.ID;
        this.emisiones = new ArrayList<>();

        this.locutores.add(locutor);
        this.locutores.get(0).addPrograma(this);

        Programa.ID++;
    }

    public Emision getLastEmision() {
        return this.emisiones.get(this.emisiones.size() - 1);
    }

    public boolean addLocutor(Locutor locutor) {
        if (!this.locutores.contains(locutor)) {
            this.locutores.add(locutor);
            return true;
        }
        return false;
    }

    public boolean addEmision(Emision emision) {
        if (!this.emisiones.contains(emision)) {
            this.emisiones.add(emision);
            return true;
        }
        return false;
    }

    public ArrayList<Emision> getEmisiones() {
        return emisiones;
    }

    public String getNombre() {
        return nombre;
    }

}
