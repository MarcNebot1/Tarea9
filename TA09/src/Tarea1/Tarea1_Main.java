package Tarea1;

public class Tarea1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestic[] arrayEjemplo = new Electrodomestic [10];
		arrayEjemplo[0] = new Electrodomestic(200.0, "Rojo", 'E', 130.0);
		arrayEjemplo[1] = new Electrodomestic(500.0, "Blanco", 'F', 110.0);
		arrayEjemplo[2] = new Lavadora(10.0, "Azul", 'A', 90.0, 38.0);
		arrayEjemplo[3] = new Lavadora(600.0, "Rojo", 'A', 60.0, 20.0);
		arrayEjemplo[4] = new Lavadora(200.0, "Negro", 'B', 230.0, 40.0);
		arrayEjemplo[5] = new Televisor(240.0, "Gris", 'C', 130.0, 32.0, true);
		arrayEjemplo[6] = new Televisor(395.0, "Negro", 'F', 80.0, 47.0, true);
		arrayEjemplo[7] = new Televisor(800.0, "Blanco", 'A', 50.0, 100.0, false);
		arrayEjemplo[8] = new Televisor(600.0, "Azul", 'B', 70.0, 90.0, true);
		arrayEjemplo[9] = new Televisor();
		
		double precioTelevision = 0.0;
		double precioLavadora = 0.0;
		double precioElectrodomestico = 0.0;
		for (int i = 0; i < arrayEjemplo.length; i++) {
			arrayEjemplo[i].precioFinal();
			if (arrayEjemplo[i] instanceof Lavadora) {
				precioTelevision += arrayEjemplo[i].getPrecio();
				System.out.println("Lavadora " + (i + 1) + " " + precioTelevision + "€");
			}
		}
		
		for (int i = 0; i < arrayEjemplo.length; i++) {
			arrayEjemplo[i].precioFinal();
			if (arrayEjemplo[i] instanceof Televisor) {
				precioTelevision += arrayEjemplo[i].getPrecio();
				System.out.println("Television " + (i + 1) + " " + precioLavadora + "€");
			}
		}
		
		for (int i = 0; i < arrayEjemplo.length; i++) {
			arrayEjemplo[i].precioFinal();
			if (arrayEjemplo[i] instanceof Electrodomestic) {
				precioElectrodomestico += arrayEjemplo[i].getPrecio();
				System.out.println("Electrodoméstico " + (i + 1) + " " + precioElectrodomestico + "€");
			}
		}
		
	}
}
