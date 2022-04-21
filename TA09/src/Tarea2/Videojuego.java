package Tarea2;

public class Videojuego implements Entregable {
	// Atributos
	private String titulo;
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero;
	private String compania;

	// Constructores
	public Videojuego() {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.genero = genero;
		this.compania = compania;
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	// Métodos
	// Getters

	public String getTitulo() {
		return this.titulo;
	}

	public int getHorasEstimadas() {
		return this.horasEstimadas;
	}

	public String getGenero() {
		return this.genero;
	}

	public String getCompania() {
		return this.compania;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	@Override
	public int compareTo(Object videojuego2) {
		int estado = -1;
		// Aplicamos el casting del objeto para poder acceder a sus métodos
		Videojuego videojuego1; // Declaramos un objeto tipo Serie
		videojuego1 = (Videojuego) videojuego2;
		if (this.horasEstimadas == videojuego1.getHorasEstimadas()) {
			estado = 0;
			// si horasEst es mayor que horasEst2
		} else if (this.horasEstimadas > videojuego1.getHorasEstimadas()) {
			estado = 1;
		}

		return estado;
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
		return this.entregado;
	}

}