package app.clase3.centrodistribucion;

public class Medicamento extends Producto{

    private String posologia;
    private String contraindicaciones;

    public Medicamento(String posologia, String contraindicaciones, String codigo, String descripcion, String unidadMedida, double precio) {
        super(codigo, descripcion, unidadMedida, precio);
        this.posologia = posologia;
        this.contraindicaciones = contraindicaciones;
    }   
    
    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

}
