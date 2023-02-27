/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer10;

/**
 *
 * @author Nova
 */
public class Bombero {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private boolean especialista;
    private double totalBono;
    private static final double BONO = 50.0;

    public Bombero(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Bombero(String nombre, String apellidos, int edad) {
        this(nombre, apellidos);
        if (edad < 18 || edad > 60) {
            this.edad = 18;
        } else {
            this.edad = edad;
        }
    }

    public Bombero(String nombre, String apellidos, int edad, boolean casado, boolean especialista) {
        this(nombre, apellidos, edad);
        this.casado = casado;
        this.especialista = especialista;
    }

    public Bombero(String nombre, String apellidos, int edad, boolean casado, boolean especialista, double totalBono) {
        this(nombre, apellidos, edad, casado, especialista);
        this.totalBono = totalBono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setEdad(int edad) {
        if (edad < 18 || edad > 60) {
            return;
        }
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isCasado() {
        return this.casado;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }

    public boolean isEspecialista() {
        return this.especialista;
    }

    public double getTotalBono() {
        return this.totalBono;
    }

    public void asignarBono() {
        double bono = BONO;
        if (this.casado) {
            bono *= 2;
        }
        if (this.especialista) {
            bono *= 2;
        }
        this.totalBono += bono;
    }

    public void mostrarDatos() {
        String estadoCivil = this.casado ? "es casado" : "es soltero";
        String especialidad = this.especialista ? "es especialista" : "NO es especialista";
        System.out.printf("El bombero %s %s de %d años, %s, %s y ha acumulado %.1f nuevos soles en bonos.\n",
                this.nombre, this.apellidos, this.edad, estadoCivil, especialidad, this.totalBono);
    }
}