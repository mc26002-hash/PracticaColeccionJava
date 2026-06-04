package poo.pagina70.ejercicio3;

import poo.entidades.Alumno;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Alumno> lista = new LinkedList<>();

        // Insertar alumnos
        lista.add(new Alumno(1, "Oscar Ramirez", "RM25001"));
        lista.add(new Alumno(2, "Maria Lopez", "RM25002"));
        lista.add(new Alumno(3, "Carlos Perez", "RM25003"));

        // Mostrar alumnos
        Iterator<Alumno> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
