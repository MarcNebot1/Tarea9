package Tarea3;

public class Libro {


	private int codigoISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	// Métodos y getters & setters
	
	public Libro(int codigoISBN, String titulo, String autor, int numeroPaginas) {
		this.codigoISBN = codigoISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	// Getters & Setters
	public int getCodigoISBN() {
		return codigoISBN;
	}
	public void setCodigoISBN(int codigoISBN) {
		this.codigoISBN = codigoISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	// Método toString
	@Override
	public String toString() {
		return "El libro con ISBN " + codigoISBN + " " + titulo + " creado por el autor " + autor + ", tiene "
				+ numeroPaginas + " páginas.";
	}

}
