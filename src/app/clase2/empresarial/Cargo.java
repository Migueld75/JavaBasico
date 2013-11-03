/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.empresarial;

/**
 *
 * @author alumno
 */
public class Cargo {

    private String nombre;
    private Double sueldo;
    private Empresa empresa;
    private Cargo cargoSuperior;

    public Cargo getCargoSuperior() {
        return cargoSuperior;
    }

    public void setCargoSuperior(Cargo cargoSuperior) {
        this.cargoSuperior = cargoSuperior;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
