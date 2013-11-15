package app.clase3.centrodistribucion;

public abstract class Producto {

    private String codigo;
    private String descripcion;
    private String unidadMedida;
    private double precio;

    public Producto(String codigo, String descripcion, String unidadMedida, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
