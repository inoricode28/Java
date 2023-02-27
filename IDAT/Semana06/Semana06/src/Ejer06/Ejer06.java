/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Ejer06 {
    public static void main(String[] args) {
        Fecha fechaInicial = new Fecha();
        Fecha fechaFinal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha final en formato dd/mm/aaaa:");
        String fechaStr = scanner.nextLine();

        String[] partes = fechaStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        fechaFinal = new Fecha(dia, mes, anio);

        System.out.println("Fecha Inicial: " + fechaInicial.mostrarFecha());
        System.out.println("Fecha Final: " + fechaFinal.mostrarFecha());
        scanner.close();
    }
}

class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String mostrarFecha() {
        return dia + "/" + mes + "/" + anio;
    }
}
