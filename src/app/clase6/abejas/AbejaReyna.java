package app.clase6.abejas;

public class AbejaReyna extends Abeja implements Casta {

    public AbejaReyna(String colonia, String tipoFuncion, String tipoTrabajo, String cicloDesarrollo, String tipoCelda, int cantidadPatas, int cantidadAlas, String sexo) {
        super(colonia, tipoFuncion, tipoTrabajo, cicloDesarrollo, tipoCelda, cantidadPatas, cantidadAlas, "hembra");
    }
    

    @Override
    public void DefinirFuncion() {
        this.setTipoFuncion("Generar huevos");
    }

    @Override
    public void DefinirTipoTrabajo() {
        this.setTipoFuncion("Reproduccion");
    }

    @Override
    public void DefinirCicloDesarrollo() {
        this.setCicloDesarrollo("16 dias");
    }

    @Override
    public void DefinirTipoCelda() {
        this.setTipoCelda("Grande");
    }
}
