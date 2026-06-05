package poo.pagina70.ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Crear una lista genérica de tipo ArrayList para almacenar objetos Alumno
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // 2. Insertar valores (instanciando objetos usando el constructor)
        Alumno alumno1 = new Alumno("ALU001", "Josue David", "MB23001");
        Alumno alumno2 = new Alumno("ALU002", "Ana Abigail", "ML23002");
        Alumno alumno3 = new Alumno("ALU003", "Jose Angel", "CM23003");
        Alumno alumno4 = new Alumno("ALU003", "Oscar Andres", "CM23003");


        // Agregar los alumnos creados a la lista
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);


        // 3. Mostrar los valores en pantalla usando un bucle for-each
        System.out.println("----- LISTA DE ALUMNOS REGISTRADOS -----");
        for (Alumno alumno : listaAlumnos) {
            // Imprimir usando los métodos Getters
            System.out.println("Código: " + alumno.getCodigo() +
                    " | Nombre: " + alumno.getNombre() +
                    " | Carnet: " + alumno.getCarnet());
        }
    }
}

// Clase Entidad Alumno (Ubicada aquí mismo para evitar errores de paquetes)
class Alumno {
    private String codigo;
    private String nombre;
    private String carnet;

    // Constructor vacío
    public Alumno() {
    }

    // Constructor lleno
    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Métodos Getter y Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
}