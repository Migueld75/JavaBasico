/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.empresarial;

/**
 *
 * @author alumno
 */
public class Empresa {

    private String codigo;
    private String nombre;
    private String rUC;
    private String razonSocial;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getrUC() {
        return rUC;
    }

    public void setrUC(String rUC) {
        this.rUC = rUC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
