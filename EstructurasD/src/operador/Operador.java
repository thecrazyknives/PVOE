
package operador;

import beans.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author alumno24
 */
public class Operador {
    ArrayList<Estudiante> estudiantes;
    
    public Operador(){
    }
    
    public ArrayList llenarLista(int nDatos){
        estudiantes = new ArrayList<>();
        
        for (int i = 0; i < nDatos; i++) {
            int carrera = (int)(Math.random()*9);
            if(carrera == 0)
                carrera = 122;
            Estudiante es = new Estudiante("Nombre_"+i,"MAT"+i,carrera);
            estudiantes.add(es);
        }
        return estudiantes;
    }
    
    public void imprimirListaAlumnos(){
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    } 
    
    public void imprimirCarrera(int carrera){    
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getCarrera() == carrera){
                System.out.println(estudiante);
            }
        }
    }
    
    public ArrayList generalListaCarrera(int carrera){   
        ArrayList<Estudiante> lista = new ArrayList<>();
        
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getCarrera() == carrera){
                lista.add(estudiante);                
            }
        }
        return lista;
    }
    
    public void imprimirLista(ArrayList<Estudiante> lista){
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }
        
    }
    
}
