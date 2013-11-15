package app.clase3.centrodistribucion;

import java.util.ArrayList;

public class Botica extends CentroDistribucion {

    public Botica(String codigo, String rUC, String razonSocial, String direccion, ArrayList<String> telefonos, Distrito distrito) {
        super(codigo, rUC, razonSocial, direccion, telefonos, distrito);
    }

    @Override
    public void MostrarHorarioAtencion() {
        System.out.println("La Botica atiende todos el dia");
    }

}
