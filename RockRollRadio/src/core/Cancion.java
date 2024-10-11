package core;

public class Cancion {

    private String nombre;
    private Artista artista;
    private Genero genero;

    public Cancion(String nombre, Artista artista, Genero genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        
        this.artista.addCancion(this);
    }

    public Artista getArtista() {
        return artista;
    }

}
