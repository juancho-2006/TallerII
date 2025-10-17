public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.disponible = disponible;
    }

    public Libro() {
    }

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

