/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.estatico;

/**
 *
 * @author alumno
 */
public class Estatico {

    public static int contador;

    public Estatico() {
        contador++;
    }

    public static double dolarAEuro(double dolar) {
        double euro = dolar * 0.81559;
        return euro;
    }
}
