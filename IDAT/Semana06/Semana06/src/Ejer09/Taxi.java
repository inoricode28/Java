/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer09;

/**
 *
 * @author Nova
 */
public class Taxi {
    
    private final String placa;
    private String conductor;
    private boolean permiso;
    private int servicios;
    private double ganancia;
    
    public Taxi(String placa, String conductor, boolean permiso, int servicios, double ganancia) {
        this.placa = placa;
        this.conductor = conductor;
        this.permiso = permiso;
        this.servicios = servicios;
        this.ganancia = ganancia;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getConductor() {
        return conductor;
    }
    
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    
    public boolean isPermiso() {
        return permiso;
    }
    
    public void activarPermiso() {
        permiso = true;
    }
    
    public void desactivarPermiso() {
        permiso = false;
    }
    
    public int getServicios() {
        return servicios;
    }
    
    public void agregarServicio(double precio) {
        if (permiso) {
            servicios++;
            ganancia += precio;
        } else {
            System.out.println("El taxi no puede realizar servicios cuando su permiso está inactivo");
        }
    }
    
    public double getGanancia() {
        return ganancia;
    }
    
    public void mostrarDatos() {
        System.out.println("Placa: " + placa);
        System.out.println("Conductor: " + conductor);
        System.out.println("Permiso activo: " + permiso);
        System.out.println("Cantidad de servicios: " + servicios);
        System.out.println("Ganancia acumulada: " + ganancia);
    }
}
