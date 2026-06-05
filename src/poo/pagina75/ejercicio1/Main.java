package poo.pagina75.ejercicio1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeSet<Double> numeros = new TreeSet<>();

        String respuesta;

        do {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();

            numeros.add(numero);

            System.out.print("¿Desea ingresar otro número? (S/N): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("\nNúmeros ordenados de menor a mayor:");

        for (Double numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}