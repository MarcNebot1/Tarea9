package Tarea5;

public class Aula {

	private int identificadorNumerico;
	private static int contadorNumerico = 0; // Al declararlo static todos los objetos comparten la misma variable
	private int maximoEstudiantes;
	private String materiaAsignada;
	private Alumno[] listaAlumnos;

	// Constructores
	public Aula(int estudiantes, String materia) {
		this.maximoEstudiantes = estudiantes;
		this.materiaAsignada = materia;
		this.identificadorNumerico = contadorNumerico++;
		this.listaAlumnos = new Alumno[this.maximoEstudiantes];

	}

	// Métodos
	/*private Alumno rellenarAula() {
		int randomizador = (int) (Math.random() * 10) + 1; // Random entre 1 y 10
		String nombre = "";
		int edad;
		boolean sexo;
		int calificacion;

		switch (randomizador) {
		case 1:
			nombre = "Jorge";

			break;
		case 2:
			nombre = "Álex";

			break;
		case 3:
			nombre = "Sara";

			break;
		case 4:
			nombre = "Mohammed";

			break;
		case 5:
			nombre = "Jose";

			break;
		case 6:
			nombre = "Borja";

			break;
		case 7:
			nombre = "Mar";

			break;
		case 8:
			nombre = "Marta";

			break;
		case 9:
			nombre = "María";

			break;
		case 10:
			nombre = "Jesús";

			break;
		}
		edad = (int) (Math.random() * 9) + 10; // random entre 10 y 18

		// si da 1 es true (hombre) si da 2 es false (mujer)
		if ((int) (Math.random() * 2) == 1) { // random entre 0 y 1
			sexo = true;
		} else {
			sexo = false;
		}
		
		calificacion = (int) (Math.random() * 11); // un random entre 0 y 10

		Alumno alumno1 = new Alumno(nombre, edad, sexo, calificacion);
		
		return alumno1;
	}*/

}
