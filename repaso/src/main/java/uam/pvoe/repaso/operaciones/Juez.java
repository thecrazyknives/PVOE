
package uam.pvoe.repaso.operaciones;
import java.util.ArrayList;
import uam.pvoe.repaso.clases.Alumno;

/**
 *
 * @author Kranlo
 */
public class Juez {
    
    private ArrayList<Alumno> alumnos;

    public Juez(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public void Calificar(){
        int posicion = -1;
        float calificacion = -1;
        
        for(int j=0;j<3;j++){
            for(int i=0;i<alumnos.size();i++){
            if(calificacion < alumnos.get(i).getAverage()){
                calificacion = alumnos.get(i).getAverage();
                posicion = i;           
            }            
            System.out.println(alumnos.get(i));
            alumnos.remove(posicion);
            }
        }  
        /*
        determinar el mayor 
            hay empate 
        determinar el siguiente
            Hay empate 
        */     
    }

}