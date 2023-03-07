/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otroPaquete;

/**
 *
 * @author LENOVO
 */
public class Bombero {
    private String nombre, apellido;
    private int edad;
    private boolean casado, especialista;
    private double totalBono, bono=100.0;
    
    public Bombero() {
        this.nombre="------";
        this.apellido="------";
        this.edad=18;
        this.casado=false;
        this.especialista=false;
        this.bono=100.0;
        this.totalBono=100.0;
    }
    public Bombero(String nombre, String apellido) {
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public Bombero(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        if (edad < 18 || edad > 60) {
            this.edad=18;
        } else {
            this.edad=edad;
        }
    }
    public Bombero(String nombre, String apellido, int edad, boolean casado, boolean especialista) {
        this(nombre, apellido, edad);
        this.casado=casado;
        this.especialista=especialista;
    }
    public Bombero(String nombre, String apellido, int edad, boolean casado, boolean especialista, double totalBono) {
        this(nombre, apellido, edad, casado, especialista);
        this.totalBono=totalBono;
    }
    public void asignarBono() {
        double b=bono;
        if (getCasado() && getEspecialista()) {
            b *= 3;
        } else if (getCasado() || getEspecialista()) {
            b *= 2;
        }
        this.totalBono += b;
    }
    public void mostrarData() {
        System.out.println("El bombero "+getNombre()+" "+getApellido()+" de "+getEdad()+ " años, "+(getCasado() ? "es casado" : "NO es casado")+", "+(getEspecialista() ? "es especialista" : "NO es especialista")+ " y ha acumulado S/."+getTotalBono()+ " en bonos.");
    }
    // gets y sets
    public String getNombre() {
        return nombre;
    }    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getApellido() {
        return apellido;
    }    
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }
    public int getEdad() {
        return edad;
    }    
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public boolean getCasado() {
        return casado;
    }    
    public void setCasado(boolean casado) {
        this.casado=casado;
    }
    public boolean getEspecialista() {
        return especialista;
    }    
    public void setEspecialista(boolean especialista) {
        this.especialista=especialista;
    }
    public double getTotalBono() {
        return totalBono;
    }    
    public void setTotalBono(double totalBono) {
        this.totalBono=totalBono;
    }
}
