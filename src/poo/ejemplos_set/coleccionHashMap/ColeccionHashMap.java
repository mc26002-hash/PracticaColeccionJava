package poo.ejemplos_set.coleccionHashMap;

import java.util.HashMap;
import java.util.Map;

public class ColeccionHashMap {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("001", "David Alvarenga");
        diccionario.put("002", "Marvin Barrera");
        diccionario.put("003", "Elena Mendoza");

        System.out.println(diccionario.get("002"));
        System.out.println();

        for (Map.Entry<String, String> registro : diccionario.entrySet()) {
            System.out.println(registro.getKey() + " " + registro.getValue());
        }
    }
}