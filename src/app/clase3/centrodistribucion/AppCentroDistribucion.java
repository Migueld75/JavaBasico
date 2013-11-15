package app.clase3.centrodistribucion;

import java.util.ArrayList;

public class AppCentroDistribucion {

    public static void main(String[] args) {
        Botica botica = new Botica("B01", "11111111111", "Botica", "Pasaje Juarez 222", new ArrayList<String>() {
            {
                add("014361264");
                add("014361264");
            }
        }, new Distrito("San Borja"));

        botica.MostrarHorarioAtencion();

        Farmacia farmacia = new Farmacia("B01", "11111111111", "Botica", "Pasaje Juarez 222", new ArrayList<String>() {
            {
                add("014361264");
                add("014361264");
            }
        }, new Distrito("San Borja"), 9, 21);

        farmacia.MostrarHorarioAtencion();
        
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal();
    }

}
