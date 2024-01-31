/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.plantillas.operaciones;

import uam.pvoe.sw.plantillas.clases.Usuario;
import uam.pvoe.sw.plantillas.compartido.Compartido;


/**
 *
 * @author Equipo de trabajo
 */
public class ValidarUsuario {
    
    
    
    public boolean validarUsuario(Usuario usr){
        
        if(usr.getLogin().compareTo("admin")==0){
            if(usr.getPassword().compareTo("31749")==0){
                Compartido.login="admin";
                Compartido.tipoUsuario="admin";
                return true;
            }else{
                return false;
            }
        }
        
        else if(usr.getLogin().compareTo("usrA")== 0 || usr.getLogin().compareTo("usrB")==0){
                if(usr.getLogin().compareTo("usrA")==0){
                    if(usr.getPassword().compareTo("usrAAA")==0){
                        Compartido.login=usr.getLogin();
                        Compartido.tipoUsuario="usr";
                        return true;
                    }else{
                        return false;
                    }
                }
                if(usr.getLogin().compareTo("usrB")==0){
                    if(usr.getPassword().compareTo("usrBBB")==0){
                        Compartido.login=usr.getLogin();
                        Compartido.tipoUsuario="usr";
                        return true;
                    }else{
                        return false;
                    }
                    
                }
                
            }
            
                return false;
            
        
        
    }
    
    
}
