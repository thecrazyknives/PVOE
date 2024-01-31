/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.plantillas.clases;

import java.util.LinkedList;

/**
 *
 * @author josue
 */
public class Pregunta {
    
    private String pregunta;
    private int id;
    private LinkedList<String> listaOpciones;
    private String tipoPregunta;

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<String> getListaOpciones() {
        return listaOpciones;
    }

    public void setListaOpciones(LinkedList<String> listaOpciones) {
        this.listaOpciones = listaOpciones;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }
    
    
    
}
