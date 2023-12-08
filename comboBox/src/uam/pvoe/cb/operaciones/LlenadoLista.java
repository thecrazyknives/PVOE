/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.cb.operaciones;

import java.util.LinkedList;

/**
 *
 * @author alumno37
 */
public class LlenadoLista {
    
    public LlenadoLista() {
    }
    
    public LinkedList<String> llenadoListaPrimaria() {
        LinkedList<String>  primaria = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            primaria.add("Opcion " + i);            
        }  
        
        return primaria;
    }
    
    public LinkedList<String> llenadoListaDependiente(int n) {
        LinkedList<String>  secundaria = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            secundaria.add("Opcion " + i + " dependiente de " + n);            
        }
        return secundaria;
    }
}
