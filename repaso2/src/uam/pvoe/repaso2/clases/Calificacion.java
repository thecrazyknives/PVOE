/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.repaso2.clases;

/**
 *
 * @author kranlo
 */
public class Calificacion {
    private String note;
    private int projectAvg;
    private int programsAvg;

    public Calificacion(int projectAvg, int programsAvg) {
        this.projectAvg = projectAvg;
        this.programsAvg = programsAvg;
        
            int prom = (int) (programsAvg*(.6) + projectAvg*(.4));
            if(prom>=0 && prom<=59)
                this.note = "NA";
            else if(prom>=60 && prom<=78)
                this.note = "S";
            else if(prom>=79 && prom<=87)
                this.note = "B";
            else if(prom>=88 && prom<=100)
                this.note = "MB";
    }

    public String getNote() {
        return note;
    }

    public int getProjectAvg() {
        return projectAvg;
    }

    public int getProgramsAvg() {
        return programsAvg;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setProjectAvg(int projectAvg) {
        this.projectAvg = projectAvg;
    }

    public void setProgramsAvg(int programsAvg) {
        this.programsAvg = programsAvg;
    }

    @Override
    public String toString() {
        return  note + " project: " + projectAvg + " program: " + programsAvg + " Note: "+note;
    }
       
}
