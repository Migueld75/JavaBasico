/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.universo;

import app.clase3.universo.abstractas.SerVivo;

/**
 *
 * @author alumno
 */
public abstract class Humano extends SerVivo{
    public void contaminar(){
        System.out.println("contaminando");
    }
}
