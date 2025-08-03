package test.java.contenido;

import org.junit.jupiter.api.Test;

import main.java.contenido.Pelicula;

import static org.junit.jupiter.api.Assertions.*;

public class ContenidoAudiovisualTest {
    @Test
    public void testCrearPelicula() {
        Pelicula p = new Pelicula("Matrix", "Ciencia Ficción", 136);
        assertEquals("Matrix", p.getTitulo());
        assertEquals("Ciencia Ficción", p.getGenero());
        assertEquals(136, p.getDuracion());
    }
}