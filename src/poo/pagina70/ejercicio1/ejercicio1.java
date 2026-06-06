package poo.pagina70.ejercicio1;

import java.util.Scanner;

public class ejercicio1  {

    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double sumaTotal = 0;
        int contadorTotal = 0;
        int contadorPositivos = 0;

        System.out.println("--- Registro de Números ---");

        while (true) {
            System.out.print("Introduce un número (o escribe 'salir' para terminar): ");
            String entrada = leer.next();

            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {

                double numero = Double.parseDouble(entrada);

                sumaTotal += numero;
                contadorTotal++;


                if (numero > 0) {
                    contadorPositivos++;
                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido o la palabra 'salir'.");
            }
        }


        System.out.println("\n--- Resultados ---");
        if (contadorTotal > 0) {
            double promedio = sumaTotal / contadorTotal;
            System.out.println("Cantidad total de números introducidos: " + contadorTotal);
            System.out.printf("Promedio de los números: %.2f\n", promedio);
            System.out.println("Cantidad de números positivos: " + contadorPositivos);
        } else {
            System.out.println("No se registró ningún número.");
        }

        leer.close();
    }
}
