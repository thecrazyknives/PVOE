
package uam.pvoe.registro.clases;

/**
 *
 * @author alumno37
 */
public class Interes {
    private String deportivos;
    private String culturales;
    private String recreativos;

    public Interes() {
    }

    public Interes(String deportivos, String culturales, String recreativos) {
        this.deportivos = deportivos;
        this.culturales = culturales;
        this.recreativos = recreativos;
    }

    public String getDeportivos() {
        return deportivos;
    }

    public String getCulturales() {
        return culturales;
    }

    public String getRecreativos() {
        return recreativos;
    }

    @Override
    public String toString() {
        return "{" + "  " + deportivos + "  " + culturales + "  " + recreativos + '}';
    }

    public void setDeportivos(String deportivos) {
        this.deportivos = deportivos;
    }

    public void setCulturales(String culturales) {
        this.culturales = culturales;
    }

    public void setRecreativos(String recreativos) {
        this.recreativos = recreativos;
    }
        
}
