/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.interfaces.capital;

/**
 *
 * @author alumno
 */
public class Imprenta {

    public static void main(String[] args) {
        Capitalizable[] obj1 = new Capitalizable[3];
        obj1[0] = new Palabra("programacion en java");
        obj1[1] = new Palabra("tecsup");
        obj1[2] = new Oracion("curso java basico - tecsup");
        
        for (int i = 0; i < obj1.length; i++) {
            System.out.println("Texto " + i + ": " + obj1[i].cambiaMayuscula());
        }
        
    }
}
