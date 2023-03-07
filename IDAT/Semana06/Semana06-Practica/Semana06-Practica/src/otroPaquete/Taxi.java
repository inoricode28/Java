/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otroPaquete;

/**
 *
 * @author LENOVO
 */
public class Taxi {
    private String placa, conductor;
    private boolean permiso;
    private int servicios;
    private double ganancia;
    
    public Taxi() {
        this.placa="------";
        this.conductor="------";
        this.permiso=false;
        this.servicios=0;
        this.ganancia=0.0;
    }
    public Taxi(String placa, String conductor) {
        if (!placa.matches("^[a-zA-Z0-9]{6}$")) {
            System.out.println("La placa debe tener 6 caracteres alfanúmericos.");
            return;
        }
        this.placa=placa;
        this.conductor=conductor;
        this.permiso=false;
        this.servicios=0;
        this.ganancia=0.0;
    }
    public void activarPermisos() {
        this.permiso=true;
    }
    public void desactivarPermisos() {
        this.permiso=false;
    }
    public void realizarSerivicio(double precio) {
        if (this.permiso) {
            this.servicios++;
            this.ganancia +=precio;
        } else {
            System.out.println("El permiso del taxi esta inactivo.");
        }
    }
    public void mostrarData() {
        System.out.println("\nDatos del Taxi placa: "+getPlaca());
        System.out.println("Conductor: "+getConductor());
        System.out.println("Permiso: "+(getPermiso() ? "Activo" : "Inactivo"));
        System.out.println("Servicios realizados: "+getServicios());
        System.out.println("Ganancia: S/."+getGanancia());
    }
    // gets y sets
    public String getPlaca() {
        return placa;
    }    
    public void setPlaca(String placa) {
        this.placa=placa;
    }
    public String getConductor() {
        return conductor;
    }    
    public void setConductor(String conductor) {
        this.conductor=conductor;
    }
    public boolean getPermiso() {
        return permiso;
    }    
    public void setPermiso(boolean permiso) {
        this.permiso=permiso;
    }
    public int getServicios() {
        return servicios;
    }    
    public void setServicios(int servicios) {
        this.servicios=servicios;
    }
    public double getGanancia() {
        return ganancia;
    }    
    public void getGanancia(double ganancia) {
        this.ganancia=ganancia;
    }
}
