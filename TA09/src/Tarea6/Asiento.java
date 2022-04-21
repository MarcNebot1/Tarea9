package Tarea6;

public class Asiento {
    // Atributos
    private Espectador espectador;
    private char fila;
    private int columna;
    private boolean posicion;

    // Constructores
    public Asiento(char fila, int columna) {
        this.espectador = espectador;
        this.fila = fila;
        this.columna = columna;
        this.posicion = posicion;
    }

    // Getters and Setters
    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public boolean getPosicion() {
        return posicion;
    }

    public void setPosicion(boolean posicion) {
        this.posicion = posicion;
    }
    public static double randomizar(int min, int max) {
        double randomizador = Math.floor(Math.random() * (max - min + 1) + min); //
        return randomizador;
    }

}
