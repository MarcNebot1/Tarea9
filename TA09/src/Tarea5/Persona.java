package Tarea5;

public abstract class Persona {
	// Atributos
	private String nombre;
	private int edad;
	// true va a ser Hombre, false va a ser Mujer
	private boolean sexo;
	
	// Construcores
	public Persona (String nombre, int edad, boolean sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	// M�todos
	// En cada clase actuar� de forma diferente (Polimorfismo)
	public abstract boolean asistencia();
}
