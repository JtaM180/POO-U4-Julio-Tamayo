package main.java.contenido;

public class Pelicula extends ContenidoAudiovisual {
    private int duracion;

    public Pelicula(String titulo, String genero, int duracion) {
        super(titulo, genero);
        this.duracion = duracion;
    }

    public int getDuracion() { return duracion; }
}