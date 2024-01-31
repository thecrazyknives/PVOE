/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.plantillas.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import uam.pvoe.sw.plantillas.clases.Cuestionario;
import uam.pvoe.sw.plantillas.clases.Pregunta;
import uam.pvoe.sw.plantillas.compartido.Compartido;

/**
 *
 * @author josue
 */
public class OperacionesCuestionario {
    
    public Cuestionario datosCuestionario(){
        
        Cuestionario cuestionario = new Cuestionario();
        cuestionario.setTituloCuestionario("Cuestionario de Desempeño Académico");
        cuestionario.setnPreguntas(10);
        Compartido.totalPreguntas = cuestionario.getnPreguntas();
        
        return cuestionario;
        
    }
    
    public Pregunta regresaPregunta(int numeroPregunta){
        
          String cadenaLeida = "";
          Pregunta pregunta = new Pregunta();
          LinkedList<String>respuestas = new LinkedList();
          
        FileReader fr;
        try {
            fr = new FileReader("preguntas.dat");
            BufferedReader archivoLectura = new BufferedReader(fr);
            cadenaLeida = archivoLectura.readLine();
            while (cadenaLeida != null) {
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
                pregunta = new Pregunta();
                
                pregunta.setId(Integer.parseInt(st.nextToken()));
                pregunta.setPregunta(st.nextToken());
                pregunta.setTipoPregunta(st.nextToken());
                
                respuestas = listaOpciones(pregunta.getId());
                pregunta.setListaOpciones(respuestas);
                
                if(pregunta.getId()==numeroPregunta){
                    break;
                }else{
                    cadenaLeida = archivoLectura.readLine();
                }
                
                
            }
            archivoLectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No se pudo leer del archivo");
            e.printStackTrace();
        }
        
        
        return pregunta;
        
    }
    
    public LinkedList<String> listaOpciones(int idPregunta){
        
           String cadenaLeida = "";
          Pregunta pregunta = new Pregunta();
          LinkedList<String>respuestas = new LinkedList();
          
        FileReader fr;
        try {
            fr = new FileReader("opciones_pregunta.dat");
            BufferedReader archivoLectura = new BufferedReader(fr);
            cadenaLeida = archivoLectura.readLine();
            while (cadenaLeida != null) {
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");

                int id=Integer.parseInt(st.nextToken());
                int clavePregunta = Integer.parseInt(st.nextToken());
                String respuesta = st.nextToken();
                
                if(clavePregunta == idPregunta){
                    respuestas.add(respuesta);
                }
                
                if(clavePregunta > idPregunta){
                    break;
                }
                
                else{
                    cadenaLeida = archivoLectura.readLine();
                }
                
                
            }
            archivoLectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No se pudo leer del archivo");
            e.printStackTrace();
        }
        
        
        return respuestas;
    } 
    
}
