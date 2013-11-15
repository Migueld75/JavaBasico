package app.clase3.centrodistribucion;

import java.util.ArrayList;

public class Farmacia extends CentroDistribucion {

    private int horaApertura;
    private int horaCierre;

    public Farmacia(String codigo, String rUC, String razonSocial, String direccion, ArrayList<String> telefonos, Distrito distrito, int horaApertura, int horaCierre) {
        super(codigo, rUC, razonSocial, direccion, telefonos, distrito);
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    @Override
    public void MostrarHorarioAtencion() {
        System.out.println("Horario de atención de la farmacia: " + this.horaApertura + ":" + this.horaCierre);
    }

    public int getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public int getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

}
