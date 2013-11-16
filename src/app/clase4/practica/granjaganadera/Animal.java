package app.clase4.practica.granjaganadera;

import java.util.Date;

public class Animal extends Especie {

    private String codigo;
    private String nombre;
    private float pesoActual;
    private Date fechaNacimiento;
    private String observacionesGenerales;

    public Animal(String codigo, String nombre, float pesoActual, Date fechaNacimiento, String observacionesGenerales, String codig, String nombreEspecie) {
        super(codig, nombreEspecie);
        this.codigo = codigo;
        this.nombre = nombre;
        this.pesoActual = pesoActual;
        this.fechaNacimiento = fechaNacimiento;
        this.observacionesGenerales = observacionesGenerales;
    }

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

    public float getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(float pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getObservacionesGenerales() {
        return observacionesGenerales;
    }

    public void setObservacionesGenerales(String observacionesGenerales) {
        this.observacionesGenerales = observacionesGenerales;
    }
}
