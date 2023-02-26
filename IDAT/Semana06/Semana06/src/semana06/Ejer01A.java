/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana06;

/**
 *
 * @author Miguel Alfonzo Chavez Ramos
 * Ejercicio sin encapsulamiento
 */
public class Ejer01A {
    
    public static void main(String[] args) {
        Persona per = new Persona();
        per.nombre = "Carlos";
        per.apellido = "Gutierrez";
        per.edad = 150;
        per.mostrarDatos();
    }
    
}

class Persona{
    String nombre;
    String apellido;
    int edad;
    void mostrarDatos(){
        System.out.println("La edad de "+nombre + " " + apellido + "es: "+ edad + " años");    
    }
}
