package Tarea5;

public class Profesor extends Persona {
	// TODO Auto-generated constructor stub
	

// Atributos
private String materia;

public Profesor(String nombre, int edad, boolean sexo) {
	super(nombre, edad, sexo);
}

public boolean setMateria(String materia) {
	if (materia == "Matemáticas" || materia == "Filosofía" || materia == "Física") {
		this.materia = materia;
		return true;
	} else {
		return false;
	}
}

// Constructore
// Métodos
public boolean asistencia() {
	int randomNum = (int) (Math.random() * 101); // 0 a 100
	// Si randomNum es mayor que 20, asiste a clase, sinó, no asiste
	if (randomNum > 20) {
		return true;
	} else {
		return false;
	}
}



}
