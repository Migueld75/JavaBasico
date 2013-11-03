/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.bicicleta;

/**
 *
 * @author alumno
 */
public class AppBicicleta {

    public static void main(String[] args) {
        //control + space para no escribir todo
        //ctrol + r --> para cambiar el nombre de todas las clases
        Bicicleta b = new Bicicleta();
        b.setMarca("Monark");
        b.setModelo("123");
        b.cambiarLlantas();
        System.out.println(b.getMarca());
        System.out.println(b.getModelo());
    }
}
