package app.clase4.practica.granjaganadera;

public class Nutriente {

    private String nombre;
    private String unidadMedida;
    private String estado;
    private float cantidad;

    public Nutriente(String nombre, String unidadMedida, String estado, float cantidad) {
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
}
