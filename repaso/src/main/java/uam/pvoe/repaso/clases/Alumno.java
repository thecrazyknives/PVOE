
package uam.pvoe.repaso.clases;

/**
 *
 * @author Kranlo
 */
public class Alumno {
    
    private String name;
    private char group;
    private float average;

    public Alumno() {
    }
    
    public Alumno(String name, char group, float average) {
        this.name = name;
        this.group = group;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public char getGroup() {
        return group;
    }

    public float getAverage() {
        return average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return name+","+group+","+average;
    }
    
    
    
    
    
    
}
