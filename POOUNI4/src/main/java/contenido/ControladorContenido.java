package main.java.contenido;

import java.util.ArrayList;

public class ControladorContenido {
    private ArrayList<ContenidoAudiovisual> lista;

    public ControladorContenido() {
        lista = new ArrayList<>();
    }

    public void agregarContenido(ContenidoAudiovisual contenido) {
        lista.add(contenido);
    }

    public ArrayList<ContenidoAudiovisual> getContenidos() {
        return lista;
    }
}