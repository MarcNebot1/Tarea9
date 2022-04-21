package Tarea1;

public class Televisor extends Electrodomestic {
	// Atributos
	double resolucion;
	boolean sintonizadorTDT;

	// Constantes
	private final double RESOLUCIONDEFECTO = 20.0;
	private final boolean SINTONIZADORTDTDEFECTO = false;

	// Constructores
	public Televisor() {
		super();
		this.resolucion = RESOLUCIONDEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDTDEFECTO;
	}

	public Televisor(double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESOLUCIONDEFECTO;
		this.sintonizadorTDT = SINTONIZADORTDTDEFECTO;

	}

	public Televisor(double precio, String color, char consumoEnergetico, double peso, double resolucion,
			boolean sintetizadorTDT) {
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;

	}

	// Métodos
	// get de resolucion y sintonizadorTDT
	public double getResolucion() {
		return resolucion;
	}

	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void precioFinal() {
		super.precioFinal();
		if (resolucion > 40.0) {
			super.setPrecio(super.getPrecio() * 1.30);
		}

		if (sintonizadorTDT) {
			super.setPrecio(super.getPrecio() + 50.0);
		}
	}
}
	



