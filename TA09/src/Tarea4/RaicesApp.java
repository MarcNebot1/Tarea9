package Tarea4;

public class RaicesApp {

	public static void main(String[] args) {
		
		// Creamos la primera raiz
		Raices raiz1 = new Raices(5, 10, 2);

		System.out.println("RAIZ 1");
		raiz1.calcular();
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		
		// Cramos la segunda raiz
		Raices raiz2 = new Raices(1, -2, 1);

		System.out.println("\nRAIZ 2");
		raiz2.calcular();
		raiz2.obtenerRaices();
		raiz2.obtenerRaiz();
		
		// Creamos la tercera raiz
		Raices raiz3 = new Raices(7, 0, 5);

		System.out.println("\nRAIZ 3");
		raiz3.calcular();
		raiz3.obtenerRaices();
		raiz3.obtenerRaiz();

	}

}
