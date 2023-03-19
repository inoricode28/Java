/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer07;

import javax.naming.directory.AttributeModificationException;

/**
 * @author Miguel Alfonzo Chavez Ramos
 */
public class Ejer07 {
    public static void main(String[] args) {
        Alumno alu = new Alumno(12,"Juen Perez",10);
        Docente doc = new Docente(13,"Jose Ugarte",27);
        Administrativo admin = new Administrativo(14,"Sara Vente",1500);
        alu.marcaAsistencia();
        doc.marcaAsistencia();
        admin.marcaAsistencia();


    }
    
}

interface Realizable {
    int  MINIMANOTA = 13;
    void marcaAsistencia();
    void asistirCharla();    
}
class PersonaIdat implements Realizable {
    protected int id;
    protected String nombre;
    public PersonaIdat(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    @Override
    public void marcaAsistencia() {
        System.out.printf("%sMarca asistencia"+this.nombre);

    }
    @Override
    public void asistirCharla() {
        System.out.printf("%sAsistir charla"+this.nombre);
    }    

}
class Alumno extends PersonaIdat {
    int escala;
    public Alumno(int id, String nombre, int escala) {
        super(id, nombre);
        this.escala = escala;
    }
    public void pagarPension(){
        System.out.printf("%sPagar pension"+this.nombre);
    }
    public void consultarNotas(){
        System.out.printf("%sConsultar notas"+this.nombre);
    }        
}


class Asminitrativo extends PersonaIdat {
    double sueldo;
    public Asminitrativo(int id, String nombre, double sueldo) {
        super(id, nombre);
        this.sueldo = sueldo;
    }
    public void pagarPension(){
        System.out.printf("%sPagar pension"+this.nombre);
    }
    public void consultarNotas(){
        System.out.printf("%sConsultar notas"+this.nombre);
    }        
}



 


