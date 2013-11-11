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
public abstract class Soporte {

    private String titulo;
    private int maximoDiasPrestamos;
    private double precioDiaPrestamo;
    private int diasPrestamo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMaximoDiasPrestamos() {
        return maximoDiasPrestamos;
    }

    public void setMaximoDiasPrestamos(int maximoDiasPrestamos) {
        this.maximoDiasPrestamos = maximoDiasPrestamos;
    }

    public double getPrecioDiaPrestamo() {
        return precioDiaPrestamo;
    }

    public void setPrecioDiaPrestamo(double precioDiaPrestamo) {
        this.precioDiaPrestamo = precioDiaPrestamo;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        if (diasPrestamo > this.maximoDiasPrestamos) {
            System.out.println("El maximo de dias es " + this.maximoDiasPrestamos);
            return;
        }
        this.diasPrestamo = diasPrestamo;
    }

}
