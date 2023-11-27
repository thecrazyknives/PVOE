package beans;
/**
 *
 * @author alumno24
 */
public class Estudiante {
    private String nombre;
    private String matricula;
    private int carrera;

    public Estudiante(String nombre, String matricula, int carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
    public String toStringArchivo() {
        return nombre + "," + matricula + "," + carrera;
    }

    @Override
    public String toString() {
        return "E: " + nombre + "," + matricula + "," + carrera;
    }
  
}
