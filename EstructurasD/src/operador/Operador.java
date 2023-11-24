
package operador;

import beans.Estudiante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void almacenarLista(){
        try {
            FileWriter fw = new FileWriter("alumnos.txt",true);
            
            BufferedWriter bw;
            bw = new BufferedWriter(fw);
            
            for (Estudiante estudiante : estudiantes) {           
                bw.write(estudiante.toStringArchivo());
                bw.newLine();
            }            
            
            bw.flush();
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Operador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    private Estudiante conversor(String linea){
        StringTokenizer st = new StringTokenizer(linea,",");
        
        
        String nombre = st.nextToken(),matricula = st.nextToken()  ;
        int carrera = Integer.parseInt(st.nextToken());
        
        Estudiante es = new Estudiante(nombre,matricula,carrera);
        
        return es;
    }
    
    public void recuperarLista(){
        estudiantes = new ArrayList<>();
        
        FileReader fr = null;
        try {            
            fr = new FileReader("alumnos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while(linea != null){              
                estudiantes.add(conversor(linea));
                linea = br.readLine();
            }   
            br.close();            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Operador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Operador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Operador.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }    
    }
    
    public void recuperarImprimirLista(){
        this.recuperarLista();
        this.imprimirListaAlumnos();
    }
   
}
