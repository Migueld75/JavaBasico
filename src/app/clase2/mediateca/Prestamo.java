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
public class Prestamo {

    private Socio socio;
    private ArrayList<Soporte> soportes;
    private int maxejemplares;

    public Prestamo() {
        this.maxejemplares = 3;
        this.soportes = new ArrayList<Soporte>();
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public ArrayList<Soporte> getSoportes() {
        return soportes;
    }

    public void agregarSoporte(Soporte soporte, int diasPrestamo) {
        if (this.soportes.size() == this.maxejemplares) {
            System.out.println("Solo se acepta hasta 3 ejemplares");
            return;
        }
        soporte.setDiasPrestamo(diasPrestamo);        
        this.soportes.add(soporte);
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;

        for (Soporte s : soportes) {            
            precioTotal += s.getDiasPrestamo() * s.getPrecioDiaPrestamo();
        }

        return precioTotal;
    }
}
