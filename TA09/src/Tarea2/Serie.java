package Tarea2;

public class Serie implements Entregable {

	// Atributos
	private String titulo;
	private int numeroTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;

	// Constructores
	public Serie() {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	// Métodos
	// get de todos los atributos, excepto entregado

	public String getTitulo() {
		return this.titulo;
	}

	public int getNumeroTemporada() {
		return this.numeroTemporadas;
	}

	public String getGenero() {
		return this.genero;
	}

	public String getCreador() {
		return this.creador;
	}

	// set de todos los atributos, excepto entregado
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}
@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}
@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}

	public int compareTo(Object serie2) {
		int estado = -1;
		// Aplicamos el casting del objeto para poder acceder a sus métodos
		Serie serie1; // Declaramos un objeto tipo Serie
		serie1 = (Serie) serie2;
		if (this.numeroTemporadas == serie1.getNumeroTemporada()) {
			estado = 0;
			// si numTemp es mayor que numTemp2
		} else if (this.numeroTemporadas > serie1.getNumeroTemporada()) {
			estado = 1;
		}
		return estado;
	}

}
