package Apps;

import clases.Estudiante;
import clases.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EstudiantesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File archivo = new File("input/estudiantes.txt");
        ArrayList<String> lineasArchivo = new ArrayList<>();

        // Leer estudiantes desde archivo
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                lineasArchivo.add(lector.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creara al guardar.");
        }

        // Mostrar lista si existe
        if (!lineasArchivo.isEmpty()) {
            System.out.println("\nEstudiantes actuales registrados:");
            for (String l : lineasArchivo) {
                System.out.println("- " + l);
            }
        } else {
            System.out.println("No hay estudiantes aun.");
        }

        while (true) {
            System.out.print("\n¿Desea agregar un nuevo estudiante? (S/N): ");
            String opcion = sc.nextLine().trim().toUpperCase();

            if (opcion.equals("N")) {
                break;
            }

            try {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("ID: ");
                int id;
                try {
                    id = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: ingrese un numero entero.");
                    continue;
                }

                // Pedir notas
                List<Double> notas = new ArrayList<>();
                while (true) {
                    try {
                        System.out.print("Ingrese una nota: ");
                        double nota = sc.nextDouble();
                        notas.add(nota);
                    } catch (InputMismatchException e) {
                        System.out.println("Error: debe ingresar un numero decimal o entero.");
                        sc.nextLine(); // limpiar buffer
                        continue;
                    }

                    sc.nextLine(); // limpiar buffer
                    System.out.print("¿Desea agregar otra nota? (S/N): ");
                    String seguir = sc.nextLine().trim().toUpperCase();

                    if (seguir.equals("N")) {
                        break;
                    }
                }

                // Crear objeto estudiante y calcular promedio
                Estudiante estudiante = new Estudiante(nombre, id, null);
                estudiante.calcularPromedio(notas);
                lineasArchivo.add(estudiante.toString());

                System.out.println("\nEstudiante agregado correctamente:");
                estudiante.mostrarInf_Estu();

            } catch (Exception e) {
                System.out.println("Ocurrio un error inesperado: " + e.getMessage());
            }
        }

        // Guardar en archivo

        FileManager.escribirFile(archivo, lineasArchivo);
        System.out.println("\nDatos guardados correctamente.");
        sc.close();
    }
}
