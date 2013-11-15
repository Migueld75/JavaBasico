/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.universo;

import app.clase3.universo.abstractas.Humano;

/**
 *
 * @author alumno
 */
public class Terricola extends Humano{

    @Override
    public void comer() {
        System.out.println("comiendo");
    }

    @Override
    public void comunicarse() {
        System.out.println("comunicarse en ingles");
    }

    @Override
    public void sentir() {
        System.out.println("confundido");
    } 
    
}
