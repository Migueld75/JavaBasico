/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.mediateca;

/**
 *
 * @author user
 */
public class CintaYCDAudio extends Soporte {

    private String autor;
    private String lugar;
    private int duracion;

    public CintaYCDAudio(String titulo, String autor, String lugar, int duracion) {
        this.setMaximoDiasPrestamos(5);
        this.setPrecioDiaPrestamo(20.0);
        this.setTitulo(titulo);
        this.autor = autor;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
