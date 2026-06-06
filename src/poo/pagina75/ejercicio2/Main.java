package poo.pagina75.ejercicio2;

import poo.entidades.Libro;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Libro> libros = new LinkedHashSet<>();

        String respuesta;

        do {

            System.out.println("\n=== REGISTRO DE LIBROS ===");

            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Edición: ");
            String edicion = scanner.nextLine();

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            Libro libro = new Libro(id, titulo, edicion, autor);

            libros.add(libro);

            System.out.print("¿Desea ingresar otro libro? (S/N): ");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("\n=== LISTADO DE LIBROS ===");

        for (Libro libro : libros) {
            System.out.println(libro);
        }

        scanner.close();
    }
}