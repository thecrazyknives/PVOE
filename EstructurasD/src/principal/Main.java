package principal;

import operador.Operador;

/**
 *
 * @author alumno24
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operador op = new Operador();
        
        op.llenarLista(20);
        op.imprimirListaAlumnos();
        
            System.out.println();
        op.imprimirCarrera(1);
            System.out.println();
        op.imprimirCarrera(2);
            System.out.println();
        op.imprimirCarrera(3);
            System.out.println();
            
            
        op.imprimirLista(op.generalListaCarrera(5));
        
    }
    
}
