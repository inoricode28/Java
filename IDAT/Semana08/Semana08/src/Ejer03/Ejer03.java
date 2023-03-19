/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer03;

/**
 * @author Miguel Alfonzo Chavez Ramos
 */
public class Ejer03 {
    public static void main(String[] args) {
        Gato cat = new Gato("Dora",4,"Angora");
        cat.hacerRuido();
        Perro dog = new Perro("Canela",7,"Pitbull");
        dog.hacerRuido();
        GatoMontes catm = new GatoMontes("Rom Rom",5,"Europeo");
        catm.hacerRuido();

        
    }
}

interface Expresable{
    void hacerRuido();
}

abstract class Animal implements Expresable{
    String nombre;
    int edad;
    String raza;
    public Animal(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;        
    }
    @Override
    abstract public void hacerRuido();
}

class Gato extends Animal{
    public Gato(String nombre, int edad, String raza){
        super(nombre, edad, raza);        
    } 
    @Override
    public void hacerRuido(){
        System.out.println(nombre+"hace miau...");
    }
}
class GatoMontes extends Gato{
    public GatoMontes(String nombre, int edad, String raza){
        super(nombre, edad, raza);        
    }
    @Override
    final public void hacerRuido(){
        System.out.println(nombre+"hace wuigg...");
    }
}
class Perro extends Animal{
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad, raza);
    }
    @Override
    public void hacerRuido(){
        System.out.println(nombre+"Hace guau...");
    }
}