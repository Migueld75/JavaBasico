package app.clase6.abejas;

public abstract class Abeja extends Hymenoptera {

    private String colonia;
    private String tipoFuncion;
    private String tipoTrabajo;
    private String cicloDesarrollo;
    private String tipoCelda;

    public Abeja(String colonia, String tipoFuncion, String tipoTrabajo, String cicloDesarrollo, String tipoCelda, int cantidadPatas, int cantidadAlas, String sexo) {
        super(cantidadPatas, cantidadAlas, sexo, "miel");
        this.colonia = colonia;
        this.tipoFuncion = tipoFuncion;
        this.tipoTrabajo = tipoTrabajo;
        this.cicloDesarrollo = cicloDesarrollo;
        this.tipoCelda = tipoCelda;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(String tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getCicloDesarrollo() {
        return cicloDesarrollo;
    }

    public void setCicloDesarrollo(String cicloDesarrollo) {
        this.cicloDesarrollo = cicloDesarrollo;
    }

    public String getTipoCelda() {
        return tipoCelda;
    }

    public void setTipoCelda(String tipoCelda) {
        this.tipoCelda = tipoCelda;
    }
}
