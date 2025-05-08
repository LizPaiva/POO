public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }


    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Disponible " + (disponible ? "Sí" : "No"));
        System.out.println("---------------------------");
    }


    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("prestado.");
        } else {
            System.out.println("no se puede prestar.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Lo devolvieron.");
    }
}
