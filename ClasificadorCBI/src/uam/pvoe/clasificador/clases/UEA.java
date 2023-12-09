// autor : Karán López Eliú Isaí        2203002155

package uam.pvoe.clasificador.clases;


/*
 * Esta clase almacena información relevante de una determinada UEA
 */
public class UEA {
    private String clave;
    private String nombre;
    private double horasTeoricas;
    private double horasPracticas;

    /*
     * Existen dos modalidades de constructor para una mayor versatilidad
     */
    public UEA() {
    }

    public UEA(String clave, String nombre, double horasTeoricas, double horasPracticas) {
        this.clave = clave;
        this.nombre = nombre;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
    }

    /*
     * Los getters y setters no tienen nada destacable
     */
    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHorasTeoricas() {
        return horasTeoricas;
    }

    public double getHorasPracticas() {
        return horasPracticas;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTeoricas(double horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public void setHorasPracticas(double horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    /*
     * Este metodo devuelve un numero correspondiente a un determinado departamento de CBI
     */
    public int obtenerDepartamento(){
        return Integer.parseInt(""+this.clave.charAt(2));
    }

    @Override
    public String toString() {
        return clave + " : " + nombre + " | horasTeoricas: " + horasTeoricas + ", horasPracticas: " + horasPracticas;
    }

        
      
}
