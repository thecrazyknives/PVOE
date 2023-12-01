/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.fraccion.operaciones;

import uam.pvoe.fraccion.clases.Fraccion;

/**
 *
 * @author alumno31
 */
public class Generador {

    public Generador() {
    }
    
    public Fraccion generar(){
        int numerador = (int)Math.floor(Math.random()*10+1);
        int denominador = (int)Math.floor(Math.random()*10+1);
        
        return new Fraccion(numerador,denominador);
    }
    
}
