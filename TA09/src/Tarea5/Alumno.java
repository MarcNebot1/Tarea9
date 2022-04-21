package Tarea5;

public class Alumno extends Persona {
	// Atributos, tener en cuenta los de la clase Persona
	private int calificacionActual;

	// Constructor
	public Alumno(String nombre, int edad, boolean sexo, int calificacionActual) {
		super(nombre, edad, sexo);
		this.calificacionActual = calificacionActual;
	}
	
	// Métodos
	public boolean asistencia() {
		int randomNum = (int) (Math.random() * 101); // 0 a 100
		// Si randomNum es mayor que 50, asiste a clase, sinó, no asiste
		if (randomNum > 50) {
			return true;
		} else {
			return false;
		}
	}
}