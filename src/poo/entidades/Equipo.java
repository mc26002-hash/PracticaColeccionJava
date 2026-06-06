package poo.entidades;

public class Equipo implements Comparable<Equipo> {

    private int id;
    private String nombre;
    private String pais;
    private int copas;

    public Equipo() {
    }

    // Constructor para Ejemplo3ArrayList y Ejemplo2LinkedList
    public Equipo(String nombre, String pais, int copas) {
        this.nombre = nombre;
        this.pais = pais;
        this.copas = copas;
    }

    // Constructor para TreeSet
    public Equipo(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    @Override
    public int compareTo(Equipo otro) {
        return this.id - otro.getId();
    }
}