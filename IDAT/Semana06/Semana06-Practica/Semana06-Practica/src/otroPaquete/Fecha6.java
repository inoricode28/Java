/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otroPaquete;

/**
 *
 * @author LENOVO
 */
public class Fecha6 {
    private int dia, mes, a�o;
    
    public Fecha6() {
        this.dia=1;
        this.mes=1;
        this.a�o=2000;
    }
    public Fecha6(int dia, int mes, int a�o) {
        this.dia=dia;
        this.mes=mes;
        this.a�o=a�o;
    }
    public String mostrarFecha() {
        return getDia()+"/"+getMes()+"/"+getA�o();
    }
    public int getDia() {
        return dia;
    }    
    public void setDia(int dia) {
        this.dia=dia;
    }
    public int getMes() {
        return mes;
    }    
    public void setMes(int mes) {
        this.mes=mes;
    }
    public int getA�o() {
        return a�o;
    }    
    public void setA�o(int a�o) {
        this.a�o=a�o;
    }
}
