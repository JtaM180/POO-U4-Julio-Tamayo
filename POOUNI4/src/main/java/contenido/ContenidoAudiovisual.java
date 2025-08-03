package main.java.contenido;

public class ContenidoAudiovisual {
    protected String titulo;
    protected String genero;

    public ContenidoAudiovisual(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
}