/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.empresarial;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private Date fechaIngreso;
    private String dNI;

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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }
}
