/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer01;

/**
 * @author Miguel Alfonzo Chavez Ramos
 */

public class Ejer01 {
    
    public static void main(String[] args) {
        Nadador nadador = new Nadador();
        nadador.nadaLibre();
        nadador.nadaMariposa();
    }
    
}
interface Nadable{
    void nadaLibre();
    void nadaMariposa();
}

class Nadador implements Nadable{
    @Override
    public void nadaLibre(){
        System.out.println("Nado libremente...");        
    }
    @Override
    public void nadaMariposa(){
        System.out.println("Nado con estilo mariposa...");        
    }
}