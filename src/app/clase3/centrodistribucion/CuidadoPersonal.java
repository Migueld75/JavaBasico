package app.clase3.centrodistribucion;

public class CuidadoPersonal extends Producto {
    private float descuento;

    public CuidadoPersonal(float descuento, String codigo, String descripcion, String unidadMedida, double precio) {
        super(codigo, descripcion, unidadMedida, precio);
        this.descuento = descuento;
    }    
    
    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

}
