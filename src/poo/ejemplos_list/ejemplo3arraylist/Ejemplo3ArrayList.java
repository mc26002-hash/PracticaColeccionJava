package poo.ejemplos_list.ejemplo3arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Equipo {
    private String nombre;
    private String pais;
    private int copas;

    public Equipo() {
    }

    public Equipo(String nombre, String pais, int copas) {
        this.nombre = nombre;
        this.pais = pais;
        this.copas = copas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getCopas() {
        return copas;
    }
}


public class Ejemplo3ArrayList {
    public static void main(String[] args) {

        ArrayList<Equipo> listEquipos = new ArrayList();

        Equipo eq1 = new Equipo("Sonsonate FC", "El Salvador", 0);
        Equipo eq2 = new Equipo("Santa Tecla FC", "El Salvador", 4);
        Equipo eq3 = new Equipo("Aguila FC", "El Salvador", 14);
        Equipo eq4 = new Equipo("CD FAS", "El Salvador", 16);


        listEquipos.add(eq1);
        listEquipos.add(eq2);
        listEquipos.add(eq3);
        listEquipos.add(eq4);

        for (Equipo eq : listEquipos) {
            System.out.println(eq.getNombre() + " " + eq.getPais() + " "
                    + eq.getCopas());
        }
    }
}