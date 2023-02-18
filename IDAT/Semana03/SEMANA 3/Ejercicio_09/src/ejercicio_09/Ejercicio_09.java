/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_09;

/**
 *
 * @author Jeferson
 */
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dado;
        String cadena;
        
        //Metodos de la clase Math
        dado = (int)(Math.random()*6+1);
        System.out.println("Valor del dado: "+dado);
        System.out.println("Redondeo: "+Math.round(15.89));
        System.out.println("Redondeo: "+Math.round(15.45));
        
        //Metodos de la clase String
        cadena = "Cuando las aves vuelan es porque el cielo esta despejado";
        System.out.println("'aves' se encuentra en la posicion: "+cadena.indexOf("aves"));//posicion
        System.out.println("'cielo' se encuetra en la oracion: "+cadena.contains("cielo"));//se encuentra 
        System.out.println(""+cadena.replace("las aves", "los pajaros"));
        System.out.println(cadena);
    }
    
}
