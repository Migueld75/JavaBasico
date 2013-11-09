/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.mediateca;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CintaVideo extends Soporte {

    private String director;
    private ArrayList<String> actores;
    private int duracion;

    public CintaVideo(String titulo, String director, ArrayList<String> actores, int duracion) {
        this.setMaximoDiasPrestamos(3);
        this.setPrecioDiaPrestamo(10.0);
        this.setTitulo(titulo);
        this.director = director;
        this.actores = actores;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
