
package uam.pvoe.repaso2.clases;

/**
 *
 * @author Kranlo
 */
public class Alumno {
    private String name;
    private String id;
    private Calificacion notes;

    public Alumno(String name, String id, Calificacion notes) {
        this.name = name;
        this.id = id;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Calificacion getNotes() {
        return notes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNotes(Calificacion notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Alumno:" + name + "," + id + "," + notes;
    }
    
    
}
