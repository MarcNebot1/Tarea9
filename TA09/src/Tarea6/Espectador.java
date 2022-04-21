package Tarea6;

import java.util.Random;

public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;

    // Constructores
    public Espectador(String nombre, int edad,double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;

    }

    // Métodos
    public static double randomizar(int min, int max) {
        double randomizador = Math.floor(Math.random() * (max - min + 1) + min); //
        return randomizador;
    }

    public static int generarEdad() {
        return (int) randomizar(10, 80);
    }

    public static double generarDinero() {
        return randomizar(100, 0);
    }

    public static String generarNombres() {
        String[] arrayNombres = { "Juan", "Marta", "Jaume", "María","Pele","Maradona","Messi","Jeff Bezos" };

        return arrayNombres[(int) randomizar(0,7)];

    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

}