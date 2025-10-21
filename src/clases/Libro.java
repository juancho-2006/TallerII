package clases;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.disponible = disponible;
    }

    /*
    quite los getter y los setters por que en el objeto Libro libro1 ya se estan
    asignando los valores para el constructor y los mostre con libro1.mostrarInfo
     */
    public void mostrarInfo() {
        System.out.println("******************************");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anoPublicacion);
        System.out.println("Disponible: " + disponible);
        System.out.println("******************************");
    }


    public String toString() {
        return titulo + "," + autor + "," + anoPublicacion + "," + disponible;
    }
}


