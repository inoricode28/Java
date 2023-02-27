/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer02;

/**
 *
 * @author Nova
 */
public class Ejer02 {
public static void main(String[] args) {
        Persona per = new Persona();
        per.setNombre("Carlos");
        per.setApellido("Gutierrez");
        per.setEdad(150);
        per.mostrarDatos();
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    void mostrarDatos(){
        System.out.println("La edad de "+getNombre() + " " + getApellido() + "es: "+ getEdad() + " años");    
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
