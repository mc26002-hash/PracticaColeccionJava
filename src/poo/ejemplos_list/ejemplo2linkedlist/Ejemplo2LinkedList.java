package poo.ejemplos_list.ejemplo2linkedlist;
import java.util.LinkedList;

class Equipo {
    private String nombre;
    private String pais;
    private int copas;

    public Equipo() {}
    public Equipo(String nombre, String pais, int copas) {
        this.nombre = nombre;
        this.pais = pais;
        this.copas = copas;
    }
    public String getNombre() { return nombre; }
    public String getPais() { return pais; }
    public int getCopas() { return copas; }
}

public class Ejemplo2LinkedList {
    public static void main(String[] args) {

        LinkedList<Equipo> equipos = new LinkedList();
        Equipo eq;

        for (int i = 1; i <= 10; i++) {
            eq = new Equipo("Equipo " + i, "Pais " + i, i);
            equipos.add(eq);
        }

        for (Equipo e : equipos) {
            System.out.println(e.getNombre() + " " + e.getPais() + " "
                    + e.getCopas());
        }
    }
}