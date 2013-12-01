package app.clase6.abejas;

public class Zangano extends Abeja implements Casta{

    public Zangano(String colonia, String tipoFuncion, String tipoTrabajo, String cicloDesarrollo, String tipoCelda, int cantidadPatas, int cantidadAlas, String sexo) {
        super(colonia, tipoFuncion, tipoTrabajo, cicloDesarrollo, tipoCelda, cantidadPatas, cantidadAlas, "macho");
    }

    @Override
    public void DefinirFuncion() {
        this.setTipoFuncion("Defender el panal y reproduccion");
    }

    @Override
    public void DefinirTipoTrabajo() {
        this.setTipoTrabajo("Vigilar los alrededores del panal");
    }

    @Override
    public void DefinirCicloDesarrollo() {
        this.setCicloDesarrollo("23 dias");
    }

    @Override
    public void DefinirTipoCelda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
