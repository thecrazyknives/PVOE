// autor : Karán López Eliú Isaí        2203002155

package uam.pvoe.clasificador.operador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import uam.pvoe.clasificador.clases.UEA;


/*  Esta clase recupera y opera de un archivo predefinido una lista que contiene 
 *      las uea´s pertenecientes al departamento de CBI, contiene un ArrayList
 *      con dicha informacion
 */
public class Operador {
    
    private ArrayList <UEA> ueas;

    /*
     *  El constructor automaticamente obtiene los datos ya almacenadaos en nuestro archivo 
     */
    public Operador() {
        ueas = new ArrayList<>();
        obtenerDatos();
    }

    /*
     * Los getters y setters no contienen nada a destacar 
     */
    public ArrayList<UEA> getUeas() {
        return ueas;
    }

    public void setUeas(ArrayList<UEA> ueas) {
        this.ueas = ueas;
    }
    
    /* 
     * Este metodo recibe como parametro una linea de texto (proveniente de nuestro archivo)
     *  y devuelve un objeto UEA con la informacion contenida en esa linea 
     */
    private UEA conversor(String linea){
        StringTokenizer st = new StringTokenizer(linea,",");
        
        String clave = st.nextToken(), nombre = st.nextToken();
        double horasTeoricas = Double.parseDouble(st.nextToken()), horasPracticas = Double.parseDouble(st.nextToken());
                       
        return new UEA(clave,nombre,horasTeoricas,horasPracticas);
    }
    
    /*
     * Recupera los datos de un archivo predefinido y los convierte en un ArrayList, 
     *  atributo de esta misma clase llamado "ueas"
     */
    private void obtenerDatos(){
                
        try {
            FileReader fr = null;
            
            fr = new FileReader("uea.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while(linea != null){              
                ueas.add(conversor(linea));
                linea = br.readLine();
            }
            br.close();        
            fr.close();   
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Operador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }      
    }
    
    /*
     * Recibe como parametro un numero correspondiente a un departamento de CBI, 
     *  devulve un ArrayList que contiene la lista de las UEA´s
     */
    public ArrayList<UEA> obtenerListaDepartamental(int d){
        ArrayList<UEA> departamental = new ArrayList<>();       
        for (UEA uea : ueas) {
            if(uea.obtenerDepartamento() == d)
                departamental.add(uea);
        }        
        return departamental;      
    }
    

    /*
     * Recibe como parametro un numero correspondiente a un departamento de CBI, 
     *  imprime dicha lista departamental 
     */
    public void imprimirListaDepartamental(int d) {
        ArrayList<UEA> departamental = obtenerListaDepartamental(d);
        for (UEA uea : departamental) {
            System.out.println(uea);
        }
    }
    
    /*
     * Recibe como parametro un numero correspondiente a un departamento de CBI, 
     *  imprime informacion relevante, la cantidad de horas teoricas y practicas, 
     *  ademas de los creditos totales del departamento 
     */
    public void imprimirInformacionDepartamental(int d){
        switch (d) {
            case 1:
                System.out.println("\n\t\tDepartamento de Ciencias Basicas");
                break;
            case 2:
                System.out.println("\n\t\tDepartamento de Electronica");
                break;
            case 3:
                System.out.println("\n\t\tDepartamento de Energia");
                break;
            case 4:
                System.out.println("\n\t\tDepartamento de Materiales");
                break;
            case 5:
                System.out.println("\n\t\tDepartamento de Sistemas");
                break;
            default:
                System.out.println("\n\t\tUEA Divisional");
                break;
        }    

        ArrayList<UEA> departamental = obtenerListaDepartamental(d);
        double horasPracticas = 0, horasTeoricas = 0, creditos;
        for (UEA uea : departamental) {
            horasPracticas += uea.getHorasPracticas();
            horasTeoricas += uea.getHorasTeoricas();
        }
        creditos = 2*(horasPracticas + horasTeoricas);
        
        System.out.println("Horas teoricas : "+horasTeoricas);
        System.out.println("Horas practicas : "+horasPracticas);
        System.out.println("Total de creditos : "+creditos+"\n");
    }   
}
