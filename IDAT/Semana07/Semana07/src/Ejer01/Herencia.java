/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer01;



/**
 *
 * @author Nova
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal ani = new Animal();
       ani.hacerRuido();
       Gato cat = new Gato();
       cat.hacerRuido();
    }    
}

class Animal {
    public void hacerRuido() {
        System.out.println("Grr...");
 }
}

class Gato extends Animal {
    @Override
    public void hacerRuido() {
        System.out.println("Miauu....");
    }
}

