/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer08;

/**
 *
 * @author Nova
 */
public class Ejer08 {
    public static void main(String[] args) {
        Lampara lampara = new Lampara("rojo", false);
        System.out.println("La lámpara es de color " + lampara.getColor() + " y está " + (lampara.isIlumina() ? "encendida" : "apagada"));
        
        lampara.prender();
        System.out.println("La lámpara es de color " + lampara.getColor() + " y está " + (lampara.isIlumina() ? "encendida" : "apagada"));
        
        lampara.apagar();
        System.out.println("La lámpara es de color " + lampara.getColor() + " y está " + (lampara.isIlumina() ? "encendida" : "apagada"));
    }
}

class Lampara {
    private String color;
    private boolean ilumina;

    public Lampara(String color, boolean ilumina) {
        this.color = color;
        this.ilumina = ilumina;
    }

    public String getColor() {
        return color;
    }

    public boolean isIlumina() {
        return ilumina;
    }

    public void prender() {
        this.ilumina = true;
    }

    public void apagar() {
        this.ilumina = false;
    }
}