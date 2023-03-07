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
    private int dia, mes, año;
    
    public Fecha7() {
        this.dia=1;
        this.mes=1;
        this.año=2000;
    }
    public Fecha7(int dia, int mes, int año) {
        if (validarFecha(dia,mes,año)) {
            this.dia=dia;
            this.mes=mes;
            this.año=año;
        }
        else {
            System.out.println("La fecha ingresada es inválida, a continuación se le asignara la siguiente fecha: 1/1/2023");
            this.dia=1;
            this.mes=1;
            this.año=2023;
        }
    }
    public String mostrarFecha() {
        return getDia()+"/"+getMes()+"/"+getAño();
    }
    private boolean validarFecha(int dia,int mes,int año) {
        boolean v=true;
        if (año<1||mes<1||mes>12||dia<1||dia>diaMes(mes,año)) {
            v=false;
        } return v;
    }
    private int diaMes(int mes,int año) {
        int dm;
        switch (mes) {
            case 2:
                if (bisiesto(año)) {
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
    private boolean bisiesto(int año) {
        return (año%4==0 && año%100 !=0) || (año%400==0);
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
    public int getAño() {
        return año;
    }    
    public void setAño(int año) {
        this.año=año;
    }
}
