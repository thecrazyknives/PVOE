
package uam.pvoe.repaso2.operaciones;

import java.util.ArrayList;
import uam.pvoe.repaso2.clases.Alumno;

/**
 *
 * @author Kranlo
 */
public class Operador {
    private ArrayList<Alumno> alumnos;

    public Operador(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void showNAList(){
        for (Alumno alumno : alumnos) {
            if(alumno.getNotes().getNote().equals("NA"))
                System.out.println(alumno);
            
        }
    }
    
    public void showSList(){
        for (Alumno alumno : alumnos) {
            if(alumno.getNotes().getNote().equals("S"))
                System.out.println(alumno);
            
        }
    }
    
    public void showBList(){
        for (Alumno alumno : alumnos) {
            if(alumno.getNotes().getNote().equals("B"))
                System.out.println(alumno);
            
        }
    }
    
    public void showMBList(){
        for (Alumno alumno : alumnos) {
            if(alumno.getNotes().getNote().equals("MB"))
                System.out.println(alumno);
            
        }
    }

}
