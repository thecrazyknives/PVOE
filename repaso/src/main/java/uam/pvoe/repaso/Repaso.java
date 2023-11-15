package uam.pvoe.repaso;
import java.util.ArrayList;
import java.util.Scanner;
import uam.pvoe.repaso.clases.Alumno;
import uam.pvoe.repaso.operaciones.Juez;


/**
 *
 * @author alumno05
 */
public class Repaso {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            float avg;
            char group;
            String name;
            
            name = sc.nextLine();
            group = sc.next().charAt(0);
            avg = sc.nextFloat();
            
            Alumno alumno = new Alumno();
            alumnos.add(alumno);
           
        }
        
        Juez juez = new Juez(alumnos);
        
        
        
        
    }
}
