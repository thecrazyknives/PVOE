package operaciones;
import clases.Usuario;

/**
 *
 * @author alumno37
 */
public class Operador {

    public Operador() {
    }
  
    
    public boolean validarUsuario(Usuario usr){
        boolean respuesta = false;
        if(usr.getUsuario().compareTo("2203002155") == 0 && usr.getPassword().compareTo("2203002155pwd") == 0){
            respuesta = true;
            System.out.println("Validacion exitosa");
        } else {
            System.out.println("Validacion incorrecta, verifique sus datos");
        }
        
        return respuesta;
    }
    
}
