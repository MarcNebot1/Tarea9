package Tarea1;

import java.util.ArrayList;

//borja i marc

public class Electrodomestic {


	private double precio;
	private String color;
	private char consumoEnergetico;
	private double peso;

	// Constantes
	private final double PRECIODEFECTO = 100.0;
	private final String COLORDEFECTO = "BLANCO";
	private final char CONSUMODEFECTO = 'F';
	private final double PESODEFECTO = 5.0;
	private final ArrayList<Character> CONSUMOSPOSIBLES = new ArrayList<Character>() {
		  {
              add('A');
              add('B');
              add('C');
              add('D');
              add('E');
              add('F');
          }
	};
	private final ArrayList<String> COLORESPOSIBLES = new ArrayList<String>() {
		{
        add("BLANCO");
        add("NEGRO");
        add("ROJO");
        add("AZUL");
        add("GRIS");
		}
	};

	// Constructores
	public Electrodomestic() {
		precioFinal();
		this.color = COLORDEFECTO;
		this.consumoEnergetico = CONSUMODEFECTO;
		this.peso = PESODEFECTO;
	
	}

	public Electrodomestic(double precio, double peso) {
		this.precio = precio;
		this.color = COLORDEFECTO;
		this.consumoEnergetico = CONSUMODEFECTO;
		this.peso = peso;
	
	}

	public Electrodomestic(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		this.comprobarColor(color);
		this.comprobarConsumoEnergetico(consumo);
		this.peso = peso;
		
	}
	

	// Get de todos los atributos:
	
	public double getPrecio() {
		return this.precio;
	}

	public String getColor() {
		return this.color;
	}

	public char getConsumoEnergetico() {
		return this.consumoEnergetico;
	}

	public double getPeso() {
		return this.peso;
	}

	private void comprobarConsumoEnergetico(char letra) {
		if (CONSUMOSPOSIBLES.contains(letra)) {
			this.consumoEnergetico = letra;
		}else {
			this.consumoEnergetico = CONSUMODEFECTO;
		}
	}
	
	private void comprobarColor(String color) {
		if (COLORESPOSIBLES.contains(color.toUpperCase())) {
			this.color = color;
		}else {
			this.color = COLORDEFECTO;
		}
	}
	
	public void precioFinal() {
		if (this.consumoEnergetico == 'A') {
			this.precio += 100.0;
		}else if(this.consumoEnergetico == 'B') {
			this.precio += 80.0;
		}else if(this.consumoEnergetico == 'C') {
			this.precio += 60.0;
		}else if(this.consumoEnergetico == 'D') {
			this.precio += 50.0;
		}else if(this.consumoEnergetico == 'E') {
			this.precio += 30.0;
		}else if(this.consumoEnergetico == 'F') {
			this.precio += 10.0;
		}
		
		
		if (this.peso > 0.0 && this.peso <= 19.0) {
			this.precio += 10.0;
		}else if(this.peso >= 20.0 && this.peso <= 49.0) {
			this.precio += 50.0;
		}else if(this.peso >= 50.0 && this.peso <= 79.0) {
			this.precio += 80.0;
		}else if(this.peso > 80.0) {
			this.precio += 80.0;
		}
		
	};
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}


