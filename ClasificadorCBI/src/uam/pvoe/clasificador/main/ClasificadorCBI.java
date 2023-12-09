// autor : Karán López Eliú Isaí        2203002155

package uam.pvoe.clasificador.main;

import java.util.Scanner;
import uam.pvoe.clasificador.operador.Operador;

/*
 * El programa ofrece un sencillo menu para escoger las operaciones que queremos realizar
 */

public class ClasificadorCBI {

    public static void main(String[] args) {
        
        Operador op = new Operador();
        
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("\n\nImprimir todo (t)");
            System.out.println("Imprimir por departamento (d)");
            System.out.println("Finalizar programa (f)");
            System.out.print(">> ");
            
            String ctrl;
            ctrl = s.next();

            if (ctrl.charAt(0) == 't') {                
                for (int i=0;i<6;i++) {
                    op.imprimirInformacionDepartamental(i);
                    op.imprimirListaDepartamental(i);
                }   
            } else if (ctrl.charAt(0) == 'd') {
                System.out.print("Departamento: ");
                int d;
                d = s.nextInt();
                op.imprimirInformacionDepartamental(d);
                op.imprimirListaDepartamental(d);
            } else {
                break;
            }
        } while (true);        
    }
}
