package Tarea6;

import java.util.ArrayList;
import java.util.Hashtable;

public class Cine {
    // Atributos
    private Pelicula pelicula;
    private double precio;
    private ArrayList <Espectador> espectadors;
    private ArrayList <Asiento> asiento;
    private Hashtable<Asiento, Espectador> mapaAsientoEspectador;
    private int asientosOcupados;

    // Constantes
    private final double precioEntrada = 5.0;
    private final int edadMinima = 18;

    // Constructores
    public Cine(Pelicula pelicula, double precio) {
        
        this.pelicula = pelicula;
        this.precio = precioEntrada;
        this.espectadors = new ArrayList<Espectador>();
        this.asiento = new ArrayList<Asiento>();
    }


    public ArrayList<Asiento> getAsientos() {
		return asiento;
	}
    //Métodos
    public ArrayList<Espectador> crearEspectador() {
   
        ArrayList<Espectador> arrayEspectadores = new ArrayList<Espectador>();
        int length=(int) Espectador.randomizar(2,80);
        
        for (int i = 0; i < length; i++) {
        	
        	String nombrespectadores= Espectador.generarNombres();
        	int edad= (int) Espectador.generarEdad();
        	double dinero=  Espectador.generarDinero();
            arrayEspectadores.add(new Espectador(nombrespectadores, edad, dinero));
        }
       
        return arrayEspectadores;
    }

    public void crearAsiento(){
    	int x=0;
    	
    	char letra= 64; //

		while ( x < 8) {  //filas 
			letra++;
			for(int y=0;y<9;y++) { //columnas 
				Asiento asiento = new Asiento(letra, y+1);
				this.asiento.add(asiento);
			}
		x++;
		}
		}
    
   
    public void mostrarSala() {

	
		
		System.out.println(this.pelicula + "\n");

		// Printar los asientos
		for (int i = 1; i <= this.asiento.size(); i++) {
			Asiento asientos = asiento.get(i - 1);
			// Printar los asientos en consola
			// Si el asiento esta ocupado imprimir una "X"
			if (asientos.getPosicion()) {
				System.out.print("|" + asientos.getFila() + String.valueOf(asientos.getColumna()) + "| ");
			} else {
				System.out.print("|XX| ");
			}

			// Cada 8 columnas printar salto de linea
			if (i % 9 == 0) {
				System.out.println("\n");
			}

		}

	}

 //miramos si tiene dinero y cumple con la edad
    public boolean 	AptoEspectador(Espectador espectador1) {
    	
        if (espectador1.getEdad() >= edadMinima && espectador1.getDinero() >= precioEntrada) {
            System.out.println("El espectador cumple los requisitos para entrar.");
            return true;
        } else {
        	System.out.println("El espectador no cumple con los requisitos.");
            return false;
            
        }

    }
    
    public void asignarAsiento() {
		for (int i = 0; i < espectadors.size(); i++) {
			Espectador espectador = espectadors.get(i);

			if (this.AptoEspectador(espectador)) {
				if (this.comprobarAsientoLibre()) { // Asignar asiento si es true
					asignarAsiento(this.getAsientos(), espectador);
				}
			}
		}
	}
		public void asignarAsiento(ArrayList<Asiento> asientos, Espectador espectador) {

			boolean asignado = false;
			while (!asignado) {
				Asiento asientoss = asientos.get((int) Espectador.randomizar(0, 72));

				if (asientoss.getPosicion()) {
					this.mapaAsientoEspectador.put(asientoss, espectador);
					asientoss.setPosicion(asignado);
					asignado = true;
				}
			}

		}
		public boolean comprobarAsientoLibre() {

			if (this.asientosOcupados < 72) {
				return true;
			}
			return false;

		}
		public void sumarAsientoOcupado() {
			this.asientosOcupados++;

		}




}
