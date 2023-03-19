/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer06;



/**
 *
 * @author Nova
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gato cat = new Gato();
       cat.hacerRuido();
       Perro dog = new Perro();
       dog.hacerRuido();
       GatoMontes catm = new GatoMontes();
       catm.hacerRuido();
    }    
}

 abstract class Animal {
    abstract public void hacerRuido(); 
}

sealed class Gato extends Animal permits GatoMontes{
    @Override
    public void hacerRuido() {
        System.out.println("Miau...");
    }
}

non-sealed class GatoMontes extends Gato{
    @Override
    final public void hacerRuido() {
        System.out.println("Wuiggg...");
    }
}

final class Perro extends Animal {
    @Override
    public void hacerRuido() {
        System.out.println("Gua Gua...");
    }
}

