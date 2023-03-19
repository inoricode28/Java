/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer04;

/**
 * @author Miguel Alfonzo Chaves Ramos
 */
public class Ejer04 {
    public static void main(String[] args) {
        Gato cat = new Gato("Dora",4,"Angora");
        cat.hacerRuido();
        System.out.println("La edad de "+cat.nombre +" es: "+cat.crecer());
        Perro dog = new Perro("Canela",7,"Pitbull");
        dog.hacerRuido();
        dog.quejar();
        System.out.println("La edad de "+dog.nombre +" es: "+dog.crecer());
        GatoMontes catm = new GatoMontes("Rom Rom",5,"Europeo");
        catm.hacerRuido();
        catm.quejar();
        System.out.println("La edad de "+catm.nombre +" es: "+catm.crecer());

        
    }
}

interface Expresable{
    void hacerRuido();
    default void quejar(){
        System.out.println("mmm mmm");
    }
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
    public int crecer(){
        this.edad++;
        return this.edad;
    }
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
        System.out.println(nombre+"hace guau...");
    }
}
