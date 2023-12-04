/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.registro.clases;

/**
 *
 * @author alumno37
 */
public class Alumno {
    
    private String nombre;
    private String matricula;
    private Interes intereses;

    public Alumno() {
    }

    public Alumno(String nombre, String matricula, Interes intereses) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.intereses = intereses;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public Interes getIntereses() {
        return intereses;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setIntereses(Interes intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + ", matricula:" + matricula + ", intereses:" + intereses;
    }
    
}
