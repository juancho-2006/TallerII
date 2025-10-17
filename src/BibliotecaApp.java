import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> objetos = new ArrayList<>();
        File archivoLibro = new File("input/libros.txt");

        System.out.println("Bienvenido al registro de libros");
        System.out.println("-------------------------------");

        System.out.print("Título del libro: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        int anoPublicacion = 0;
        try {
            System.out.print("Año de publicación: ");
            anoPublicacion = sc.nextInt();// no toca poner numberformatexeption porque nextInt ya lanza el error
        } catch (InputMismatchException e) {
            System.out.println("Error: el año debe ser un número entero.");
            sc.close();
            return;
        }

        boolean disponible = true;

        Libro libro1 = new Libro(titulo, autor, anoPublicacion, disponible);
        objetos.add(libro1.toString());

        System.out.println("\nLibro agregado correctamente:\n");

        libro1.mostrarInfo();
        FileManager.escribirFile(archivoLibro, objetos);

        System.out.println("\nLibros guardados en el archivo.");
        System.out.println("\nListado de libros:\n");

        ArrayList<String> libros = (ArrayList<String>) FileManager.leerFile(archivoLibro);
        for (String l : libros) {
            System.out.println(l);
        }

        System.out.println("\nFin del programa.");
        sc.close();
    }
}
