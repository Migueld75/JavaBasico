package app.clase4.practica.granjaganadera;

import java.util.ArrayList;

public class Granja {
    private ArrayList<Especie> especies;
    private ArrayList<TipoAlimento> tipoAlimentos;

    public Granja() {
         especies = new ArrayList<Especie>() {
            {
                add(new Especie("CA01", "caballo"));
                add(new Especie("CE02", "cerdo"));
                add(new Especie("C003", "cordero"));
            }};
        
        tipoAlimentos = new ArrayList<TipoAlimento>() {
            {
                add(new TipoAlimento("TA01", "tipo A"));
                add(new TipoAlimento("TA02", "tipo B"));
                add(new TipoAlimento("TA03", "tipo C"));
            }};
    }
     
    
}
