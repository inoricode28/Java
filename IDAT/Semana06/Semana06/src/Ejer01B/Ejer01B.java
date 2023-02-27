/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer01B;

/**
 *
 * @author Nova
 */
public class Ejer01B {
    public static void main(String[] args) {
        Persona per = new Persona();
        per.identificarPersona("Carlos", "Gutierrez", 50);
        per.mostrarDatos();
    }
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    void identificarPersona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        if(edad >= 1 && edad <= 120)
            this.edad = edad;
        else
            System.out.println("Edad incorrecta");

    }
    void mostrarDatos(){
        System.out.println("La edad de "+ nombre + " " + apellido + "es: "+ edad + " años");
    }
}
