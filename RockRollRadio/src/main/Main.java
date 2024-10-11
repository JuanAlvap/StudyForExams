package main;

import core.Artista;
import core.Cancion;
import core.Emision;
import core.Genero;
import core.Invitado;
import core.Locutor;
import core.Programa;
import core.RockRollRadio;

public class Main {

    public static void main(String[] args) {
        RockRollRadio radio = new RockRollRadio();

        radio.addLocutor(new Locutor("Pedro Rock"));
        radio.addLocutor(new Locutor("Pablo Clasico"));
        radio.addLocutor(new Locutor("Simona Tropical"));
        radio.addLocutor(new Locutor("Carolina Marel"));

        radio.addPrograma(new Programa("Great Rock", radio.getLocutor(0)));
        radio.addPrograma(new Programa("Las 40 clasicas", radio.getLocutor(1)));
        radio.addPrograma(new Programa("Pa la Tropicalle", radio.getLocutor(2)));
        radio.addPrograma(new Programa("De todito", radio.getLocutor(3)));

        radio.addArtista(new Artista("Muse"));
        radio.addCancion(new Cancion("Starlight", radio.getArtista(0), Genero.ROCK));
        radio.addCancion(new Cancion("Uprising", radio.getArtista(0), Genero.ROCK));

        radio.addArtista(new Artista("Ludwig van Beethoven"));
        radio.addCancion(new Cancion("Sonata Clara de Luna", radio.getArtista(1), Genero.CLASICA));
        radio.addCancion(new Cancion("Fur Elise", radio.getArtista(1), Genero.CLASICA));

        radio.addArtista(new Artista("Carlos Vives"));
        radio.addCancion(new Cancion("Fruta fresca", radio.getArtista(2), Genero.TROPICAL));
        radio.addCancion(new Cancion("Robarte un beso", radio.getArtista(2), Genero.TROPICAL));

        radio.addEmision(new Emision(radio.getPrograma(0)));
        radio.addInvitado(new Invitado("James Hetfield"), radio.getPrograma(0).getLastEmision());
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(1));

        radio.addEmision(new Emision(radio.getPrograma(0)));
        radio.addInvitado(new Invitado("Los de Adentro"), radio.getPrograma(0).getLastEmision());
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(1));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(1));

        radio.addEmision(new Emision(radio.getPrograma(0)));
        radio.addInvitado(new Invitado("Carlos Santana"), radio.getPrograma(0).getLastEmision());
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(1));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(0).getLastEmision().addCancion(radio.getCancion(1));

        radio.addEmision(new Emision(radio.getPrograma(1)));
        radio.addInvitado(new Invitado("Alexis Trejos"), radio.getPrograma(1).getLastEmision());
        radio.getPrograma(1).getLastEmision().addCancion(radio.getCancion(2));
        radio.getPrograma(1).getLastEmision().addCancion(radio.getCancion(3));
        radio.getPrograma(1).getLastEmision().addCancion(radio.getCancion(3));

        radio.addEmision(new Emision(radio.getPrograma(1)));
        radio.addInvitado(new Invitado("Julian Navarro"), radio.getPrograma(1).getLastEmision());
        radio.getPrograma(1).getLastEmision().addCancion(radio.getCancion(2));
        radio.getPrograma(1).getLastEmision().addCancion(radio.getCancion(3));
        radio.getPrograma(1).getLastEmision().addCancion(radio.getCancion(3));

        radio.addEmision(new Emision(radio.getPrograma(2)));
        radio.addInvitado(new Invitado("Checo Acosta"), radio.getPrograma(2).getLastEmision());
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(5));
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(5));

        radio.addEmision(new Emision(radio.getPrograma(2)));
        radio.addInvitado(new Invitado("Fonseca"), radio.getPrograma(2).getLastEmision());
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(5));
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(5));

        radio.addEmision(new Emision(radio.getPrograma(2)));
        radio.addInvitado(new Invitado("Bacilos"), radio.getPrograma(2).getLastEmision());
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(2).getLastEmision().addCancion(radio.getCancion(5));

        radio.addEmision(new Emision(radio.getPrograma(3)));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(3));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(2));

        radio.addEmision(new Emision(radio.getPrograma(3)));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(1));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(2));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(3));

        radio.addEmision(new Emision(radio.getPrograma(3)));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(2));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(3));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(5));

        radio.addEmision(new Emision(radio.getPrograma(3)));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(3));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(3));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(3));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(4));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(0));
        radio.getPrograma(3).getLastEmision().addCancion(radio.getCancion(1));
        
        System.out.println("------------- Resultados -------------\n");

        for (Artista artista : radio.getArtistas()) {
            System.out.println("El programa que mas ha puesto canciones del artista " + artista.getNombre() + " es " + radio.getProgramaConMasCancionesDeArtista(artista).getNombre());
        }
    }

}

/**
 * ------------- Resultados -------------
 *
 * El programa que mas ha puesto canciones del artista Muse es Great Rock 
 * El programa que mas ha puesto canciones del artista Ludwig van Beethoven es De todito 
 * El programa que mas ha puesto canciones del artista Carlos Vives es Pa la Tropicalle
 */
