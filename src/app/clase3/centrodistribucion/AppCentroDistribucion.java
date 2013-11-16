package app.clase3.centrodistribucion;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AppCentroDistribucion {

    public static void main(String[] args) {
        
        //Preparando los objetos
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
        
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(25, "CP001", "Cepillo", "Unidad", 9);
        Medicamento medicamento = new Medicamento("Forma de aplicación", "No acerca a los ojos", "M001", "Hiroduid", "tubo", 15);
        
        Medico medico = new Medico("15851558", "Pedro Perez", "1515711", "CMP 982", 2000);
        Cliente cliente = new Cliente("44445676", "Juan Perez", "993475531");
        
        RecetaMedica recetaMedica = new RecetaMedica(new Date(), new GregorianCalendar(2015, 11, 31).getTime(), medicamento, 1, medico);
        
        //Realizar la compra
        
        Compra compra = new Compra();
        
        compra.CompraProductoPersonal(botica, cliente, cuidadoPersonal, 2);
        compra.CompraMedicamento(farmacia, cliente, recetaMedica,1);
        
        
    }

}
