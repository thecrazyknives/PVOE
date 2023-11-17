package uam.pvoe.repaso2;
import java.util.ArrayList;
import uam.pvoe.repaso2.clases.Alumno;
import uam.pvoe.repaso2.clases.Calificacion;
import uam.pvoe.repaso2.operaciones.Operador;

/**
 *
 * @author Kranlo
 */
public class main {

    public static void main(String[] args) {
     // llenar lista 
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        for(int i=0;i<100;i++) {
            int programsAvg = (int) (Math.floor(Math.random() * 100));
            int projectAvg = (int) (Math.floor(Math.random() * 100));
            Calificacion calificacion = new Calificacion(projectAvg, programsAvg);

            Alumno alumno = new Alumno("Estudiante" + i, "Estudiante" + i, calificacion);

            alumnos.add(alumno);
        }

        Operador op = new Operador(alumnos);
        op.showNAList();
            System.out.println();
        op.showSList();
            System.out.println();
        op.showBList();
            System.out.println();
        op.showMBList();
        
    } 
}