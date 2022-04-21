package Tarea2;

public class Tarea2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array de objetos tipo Serie
		Serie[] arraySeries = new Serie[5];
		arraySeries[0] = new Serie("Los Simpsons", 20, "Humor", "Matt Groening");
		arraySeries[1] = new Serie("Futurama", 17, "Ciencia Ficción", "Matt Groening");
		arraySeries[2] = new Serie("Juego de Tronos", 36, "Fantasía", "Pepe Livingston");
		arraySeries[3] = new Serie("Dragon Ball Z", 30, "Pelea", "Akira Toriyama");
		arraySeries[4] = new Serie("Humor Amarillo", 18, "Fantasía", "Takeshi");

		// Array de objetos Videojuego
		Videojuego[] arrayVideojuegos = new Videojuego[5];
		arrayVideojuegos[0] = new Videojuego("Elden Ring", 80, "Aventura", "From Software");
		arrayVideojuegos[1] = new Videojuego("Mario Kart", 20, "Carreras", "Nintendo");
		arrayVideojuegos[2] = new Videojuego("Pokémon", 12, "Por Turnos", "GameFreak");
		arrayVideojuegos[3] = new Videojuego("Blasphemous", 30, "Plataformas", "The Games Kitchen");
		arrayVideojuegos[4] = new Videojuego("Persona 5", 130, "Por Turnos", "Atlus");

		// Entrego series
		arraySeries[0].entregar();
		arraySeries[1].entregar();

		// Entrego videojuegos
		arrayVideojuegos[3].entregar();
		arrayVideojuegos[4].entregar();

		// Cuento las series entregadas
		System.out.println("SERIES ENTREGADAS");
		for (int i = 0; i < arraySeries.length; i++) {
			if (arraySeries[i].isEntregado() == true) {
				System.out.println(arraySeries[i].getTitulo() + " ha sido entregado");
			} else if (arraySeries[i].isEntregado() == false) {
				System.out.println(arraySeries[i].getTitulo() + " no ha sido entregado");
			}
		}

		// Cuento los videojuegos
		System.out.println("\nVIDEOJUEGOS ENTREGADOS");
		for (int i = 0; i < arrayVideojuegos.length; i++) {
			// No hace falta comparar el booleano con "== true false"
			if (arrayVideojuegos[i].isEntregado() == true) {
				System.out.println(arrayVideojuegos[i].getTitulo() + " ha sido entregado");
			} else if (arrayVideojuegos[i].isEntregado() == false) {
				System.out.println(arrayVideojuegos[i].getTitulo() + " no ha sido entregado");
			}
		}

		// Muestro la serie con más numeroTemporadas
		Serie serieMasLarga = arraySeries[0];
		System.out.println("\nLA SERIE MÁS LARGA");
		for (int i = 0; i < arraySeries.length; i++) {
			if (arraySeries[i].getNumeroTemporada() > serieMasLarga.getNumeroTemporada()) {
				serieMasLarga = arraySeries[i];
				System.out.println(serieMasLarga.toString() + " es la serie con más temporadas");
			}

		}

		// Muestro el videojuego con más horas estimadas
		Videojuego vjuegoMasLargo = arrayVideojuegos[0];
		System.out.println("\nEL VIDEOJUEGO MÁS LARGO");
		for (int i = 0; i < arrayVideojuegos.length; i++) {
			if (arrayVideojuegos[i].getHorasEstimadas() > vjuegoMasLargo.getHorasEstimadas()) {
				vjuegoMasLargo = arrayVideojuegos[i];
				System.out.println(vjuegoMasLargo.toString() + " es el videojuego con más horas estimadas");
			}

		}

	}

}

