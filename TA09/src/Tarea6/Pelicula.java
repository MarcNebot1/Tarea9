package Tarea6;

public class Pelicula {
    // Atributos
    private String titulo;
    private int duracion;
    private int edad;
    private String director;

   
	// Constantes
    private final int edadMinima = 16;

    // Constructores
    // Por defecto:

    public Pelicula() {
        this.titulo = "Batman";
        this.duracion = 180;
        this.edad = 20;
        this.director = "Rangutan Jones";

    }

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad = edadMinima;
        this.director = director;
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
    @Override
   	public String toString() {
   		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edad=" + edad + ", director=" + director
   				+ ", edadMinima=" + edadMinima + "]";
   	}

}