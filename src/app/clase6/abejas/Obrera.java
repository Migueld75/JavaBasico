package app.clase6.abejas;

public class Obrera extends Abeja implements Casta{

    public Obrera(String colonia, String tipoFuncion, String tipoTrabajo, String cicloDesarrollo, String tipoCelda, int cantidadPatas, int cantidadAlas, String sexo) {
        super(colonia, tipoFuncion, tipoTrabajo, cicloDesarrollo, tipoCelda, cantidadPatas, cantidadAlas, "hembra");
    }

    @Override
    public void DefinirFuncion() {
        this.setTipoFuncion("Recolectar miel");
    }

    @Override
    public void DefinirTipoTrabajo() {
        this.setTipoFuncion("Ir de flor en flor para recolectar polen");
    }

    @Override
    public void DefinirCicloDesarrollo() {
        this.setCicloDesarrollo("21 dias");
    }

    @Override
    public void DefinirTipoCelda() {
        this.setTipoCelda("Pequeña");
    }
    
    
}
