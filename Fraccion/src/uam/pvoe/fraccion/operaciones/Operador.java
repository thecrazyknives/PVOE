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
public class Operador {
    private Fraccion f1;
    private Fraccion f2;

    public Operador(Fraccion f1, Fraccion f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public Fraccion getF1() {
        return f1;
    }

    public Fraccion getF2() {
        return f2;
    }

    public void setF1(Fraccion f1) {
        this.f1 = f1;
    }

    public void setF2(Fraccion f2) {
        this.f2 = f2;
    }
    
    public boolean suma(Fraccion fRes){
        int denominador,numerador;
        denominador = f1.getDenominador() * f2.getDenominador();
        numerador = f1.getNumerador() + f2.getNumerador();
        
        if(numerador == fRes.getNumerador() && denominador == fRes.getDenominador())
            return true;
        else 
            return false;        
    }
    
    public boolean resta(Fraccion fRes){
        int denominador,numerador;
        denominador = f1.getDenominador() * f2.getDenominador();
        numerador = f1.getNumerador() - f2.getNumerador();
        
        if(numerador == fRes.getNumerador() && denominador == fRes.getDenominador())
            return true;
        else 
            return false;        
    }
    
    public boolean multiplicacion(Fraccion fRes){
        int denominador,numerador;
        denominador = f1.getDenominador() * f2.getDenominador();
        numerador = f1.getNumerador() * f2.getNumerador();
        
        if(numerador == fRes.getNumerador() && denominador == fRes.getDenominador())
            return true;
        else 
            return false;         
    }
    
    public boolean division(Fraccion fRes){
        int denominador,numerador;
        denominador = f1.getDenominador() * f2.getNumerador() ;
        numerador = f1.getNumerador() * f2.getDenominador();
        
        if(numerador == fRes.getNumerador() && denominador == fRes.getDenominador())
            return true;
        else 
            return false;         
    }

}
