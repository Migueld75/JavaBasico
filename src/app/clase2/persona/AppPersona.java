/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.persona;

/**
 *
 * @author alumno
 */
public class AppPersona {

    public static void main(String[] args) {
        Persona jose = new Persona("Jose", "Villegas", Byte.parseByte("15"));

        //shift + control + flecha arriba o abajo //copiar linea
        //shift + alt + flecha arriba o abajo // mover linea
        //suprimir linea shift + suprimir
        //sout
        //psvm
        //alt + insert
        //ctrl + space --> completa el nombre de algo
        //guardar ctrl + s
        System.out.println("nombre:" + jose.getNombre());
        System.out.println("apellido:" + jose.getApellidos());
        System.out.println("edad:" + jose.getEdad());

        Persona juan = new Persona();

        juan.setNombresApellidos("Juan", "Perez");
        System.out.println(juan.getNombre() + " " + juan.getApellidos());
    }
}
