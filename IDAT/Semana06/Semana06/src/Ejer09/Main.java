/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer09;

/**
 *
 * @author Nova
 */
import Ejer09.Taxi;

public class Main {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi("ABC123", "Juan Perez", true, 10, 500.0);
        
        taxi1.agregarServicio(100.0);
        taxi1.agregarServicio(200.0);
        
        taxi1.desactivarPermiso();
        taxi1.agregarServicio(300.0);
        
        taxi1.activarPermiso();
        taxi1.agregarServicio(400.0);
        
        taxi1.mostrarDatos();
        
    }
}