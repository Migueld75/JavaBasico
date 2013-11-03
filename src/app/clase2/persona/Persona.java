/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.persona;

/**
 *
 * @author alumno
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private byte edad;

    public Persona(String nombre, String apellidos, byte edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }    
    
    public Persona()
    {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }    
    
    public void setNombresApellidos(String nombre, String apellidos)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
