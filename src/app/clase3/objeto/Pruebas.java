/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.objeto;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Pruebas {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = d1;
        
        //Aqui compara las referencias de los objetos
        if(d1==d2){
            System.out.println("Son iguales");
        }
        
        //Para comparar el contenido del objeto
        if(d1.equals(d2)){
            System.out.println("Son iguales");
        }
        
    }
}
