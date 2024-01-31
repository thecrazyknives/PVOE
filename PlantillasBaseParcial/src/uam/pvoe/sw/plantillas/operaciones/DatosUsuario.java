/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.plantillas.operaciones;

import uam.pvoe.sw.plantillas.compartido.Compartido;

/**
 *
 * @author josue
 */
public class DatosUsuario {
    
    /*Regresa el nombre del usuario*/
    public void nombreUsuario(String usr){
        if(usr.compareTo("admin")==0){
            Compartido.nombreUsuario="Administrador del Sistema";
        }
        else if(usr.compareTo("usrA")==0){
            Compartido.nombreUsuario="Usuario A";
        }
        else if(usr.compareTo("usrB")==0){
            Compartido.nombreUsuario="Usuario B";
        }
    }
    
    public String descripcion(String usr){
        if(usr.compareTo("admin")==0){
            return "Selecciona la opción que deseas realizar";
        }else{
            return "Presiona el botón correspondiente para comenzar una prueba";
        }
    }
    
}
