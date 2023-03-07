/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otroPaquete;

/**
 *
 * @author LENOVO
 */
public class Lampara {
    private String color;
    private boolean ilumina;
    
    public Lampara() {
        this.color="Sin definir";
        this.ilumina=false;
    }
    public Lampara(String color) {
        this.color=color;
        this.ilumina=false;
    }
    public void mostrarData() {
        if(getIlumina()==false) {
            System.out.println("La lampara es color "+getColor()+" y se encuentra apagada."); 
        }
        else {
            System.out.println("La lampara es color "+getColor()+" y se encuentra encendida."); 
        }
        
    }
    public void enderder() {
        this.ilumina=true;
    }
    public void apagar() {
        this.ilumina=false;
    }
    // gets y sets
    public String getColor() {
        return color;
    }    
    public void setColor(String color) {
        this.color=color;
    }
    public boolean getIlumina() {
        return ilumina;
    }    
    public void setIlumina(boolean ilumina) {
        this.ilumina=ilumina;
    }
    
}
