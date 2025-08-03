package main.java.contenido;

import java.util.Scanner;

public class VistaConsola {

    private Scanner scanner = new Scanner(System.in);
    private ControladorContenido controlador = new ControladorContenido();

    public void iniciar() {
        System.out.println("Bienvenido al sistema de contenido audiovisual");

        System.out.print("Ingrese el título de la película: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese la duración en minutos: ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        Pelicula pelicula = new Pelicula(titulo, genero, duracion);
        controlador.agregarContenido(pelicula);

        System.out.println("\nPelícula agregada con éxito:");
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
    }

    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        vista.iniciar();
    }
}
