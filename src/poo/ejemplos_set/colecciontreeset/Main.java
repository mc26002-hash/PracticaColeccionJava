package poo.ejemplos_set.colecciontreeset;

import poo.entidades.Equipo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // Crear la colección TreeSet
        Set<String> lista = new TreeSet<>();

        lista.add("hola");
        lista.add("que tal?");
        lista.add("ya casi es navidad");
        lista.add("programadores");
        lista.add("hola");
        lista.add("el sabado hay clases");

        // Recorrer la colección
        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        System.out.println("****************** LISTA 2 ******************");

        // Declaración de colección de tipo Equipo
        TreeSet<Equipo> equipos = new TreeSet<>();

        equipos.add(new Equipo(4, "Once Lobos FC", "El Salvador"));
        equipos.add(new Equipo(1, "Sonsonate FC", "El Salvador"));
        equipos.add(new Equipo(3, "CD FAS", "El Salvador"));
        equipos.add(new Equipo(5, "Municipal Limeño", "El Salvador"));
        equipos.add(new Equipo(2, "Aguila FC", "El Salvador"));
        equipos.add(new Equipo(1, "Chalatenango FC", "El Salvador"));

        // Mostrar equipos
        for (Equipo eq : equipos) {
            System.out.println(eq.getId() + " " + eq.getNombre());
        }
    }
}