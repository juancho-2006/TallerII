package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase para lectura y escritura de archivos de texto
// La uso para guardar listas de datos simples (como nombres o registros)
public class FileManager {
    public static void escribirFile(File file, ArrayList<String> lista) {
        try {
            file.getParentFile().mkdirs(); // Me aseguro de que exista la carpeta
            FileWriter writer = new FileWriter(file, true);
            for (String linea : lista) {
                writer.write(linea + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ocurrió un error al escribir: " + e.getMessage());
        }
    }

    public static List<String> leerFile(File file) {
        ArrayList<String> lista = new ArrayList<>();
        try (Scanner lector = new Scanner(file)) {
            while (lector.hasNextLine()) {
                lista.add(lector.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. Verifica la ruta.");
        }
        return lista;
    }
}
