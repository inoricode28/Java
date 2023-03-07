/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otroPaquete;

/**
 *
 * @author LENOVO
 */
public class Fecha7 {
    private int dia, mes, a�o;
    
    public Fecha7() {
        this.dia=1;
        this.mes=1;
        this.a�o=2000;
    }
    public Fecha7(int dia, int mes, int a�o) {
        if (validarFecha(dia,mes,a�o)) {
            this.dia=dia;
            this.mes=mes;
            this.a�o=a�o;
        }
        else {
            System.out.println("La fecha ingresada es inv�lida, a continuaci�n se le asignara la siguiente fecha: 1/1/2023");
            this.dia=1;
            this.mes=1;
            this.a�o=2023;
        }
    }
    public String mostrarFecha() {
        return getDia()+"/"+getMes()+"/"+getA�o();
    }
    private boolean validarFecha(int dia,int mes,int a�o) {
        boolean v=true;
        if (a�o<1||mes<1||mes>12||dia<1||dia>diaMes(mes,a�o)) {
            v=false;
        } return v;
    }
    private int diaMes(int mes,int a�o) {
        int dm;
        switch (mes) {
            case 2:
                if (bisiesto(a�o)) {
                    dm=29;
                } else {
                    dm=28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dm=30;
                break;
            default:
                dm=31;
                break;
        } return dm;
    }
    private boolean bisiesto(int a�o) {
        return (a�o%4==0 && a�o%100 !=0) || (a�o%400==0);
    }
    // Sets y Gets
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
