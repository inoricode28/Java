/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer05;

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
       Perro dog = new Perro();
       dog.hacerRuido();
       GatoMontes catm = new GatoMontes();
       catm.hacerRuido();
    }    
}

class Animal {
    String ruido ="Grr...";
    public void hacerRuido() {
        System.out.println(ruido);
 }
}

class Gato extends Animal {
    String ruido ="Miau...";
    @Override
    public void hacerRuido() {
        super.hacerRuido();//Grr
        System.out.println(super.ruido + this.ruido);
    }
}

class Perro extends Animal {
    @Override
    public void hacerRuido() {
        super.hacerRuido();//Grr
        System.out.println("Gua Gua...");
    }
}

class GatoMontes extends Gato {
    @Override
    public void hacerRuido() {
        super.hacerRuido();//Grr Miau
        System.out.println("Wuigggg...");
    }
}