package Tarea3;

public class Tarea3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro(9788, "'La buena suerte'", "�lex Rovira", 428);
		Libro libro2 = new Libro(1111, "'Santa B�blia'", "Jes�s de Nazaret", 300);
		
		// Mostrar los dos objetos por pantalla
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		compararPaginas(libro1, libro2);
		
	}

	// M�todo comparador de libro con m�s p�ginas
	public static void compararPaginas(Libro libro1, Libro libro2) {
		if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
			System.out.println(libro1.getTitulo() + " es el libro con m�s p�ginas.");
		} else {
			System.out.println(libro2.getTitulo() + " es el libro con m�s p�ginas.");
		}
	}

}