package poo.ejemplos_set.coleccionhashset;
import java.util.HashSet;
import java.util.Set;

public class ColeccionHashSet {
    public static void main(String[] args) {
        Set<String> listaSet = new HashSet<String>();

        listaSet.add("Zope");
        listaSet.add("Perro");
        listaSet.add("Gato");
        listaSet.add("Perro");
        listaSet.add("Ratón");

        for (String elemento : listaSet) {
            System.out.println(elemento);
        }
    }
}