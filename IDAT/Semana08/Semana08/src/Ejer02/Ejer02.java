/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer02;

/**
 *
 * @author Miguel Alfonzo Chaves Ramos
 */
public class Ejer02 {
    public static void main(String[] args) {
        Deportista depor = new Deportista();
        depor.nadarLibre();
        depor.nadaMariposa();
        depor.caminar();
        depor.correr();        
    }
}

interface Nadable {
    void nadarLibre();
    void nadaMariposa();
}

interface Ejercitable {
    void caminar();
    void correr();
}

class Deportista implements Nadable, Ejercitable {
    
    @Override
    public void nadarLibre() {
        System.out.println("Nado libremente...");
    }
    @Override
    public void nadaMariposa() {
        System.out.println("Nado con estilo mariposa...");
    }
    @Override
    public void caminar() {
        System.out.println("Estoy caminando...");
    }
    @Override
    public void correr() {
        System.out.println("Estoy corriendo...");
    }
}

