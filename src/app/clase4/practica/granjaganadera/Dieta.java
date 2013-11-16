package app.clase4.practica.granjaganadera;

import java.util.ArrayList;

public class Dieta {

    private int cantidadAlimento;
    private int cantidadAgua;
    private Alimento alimento;    
    private final int NUMERO_TOMAS = 3;
    private ArrayList<Integer> tomas;
    private ArrayList<Animal> animales;    

    public Dieta(int cantidadAlimento, int cantidadAgua, Alimento alimento, ArrayList<Integer> tomas, ArrayList<Animal> animales) {
        
        //Una dieta ingerida por un animal se reparte siempre en 3 tomas
        if(tomas.size()!=NUMERO_TOMAS)
        {
            System.out.println("Numeros de tomas al dia deben ser " + NUMERO_TOMAS);
            System.out.println("Dieta no fue creada correctamente");
            return;
        }
        
        //Una dieta no existe en el sistema de información hasta que no se 
        //establece como mínimo para un animal.
        if(animales.isEmpty())
        {
            System.out.println("No existe un animal asignado a la dieta");            
            System.out.println("Dieta no fue creada correctamente");
            return;
        }
        
        this.tomas = tomas;
        this.cantidadAlimento = cantidadAlimento;
        this.cantidadAgua = cantidadAgua;
        this.alimento = alimento;        
        this.animales = animales;
    }    

    public int getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(int cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Integer> getTomas() {
        return tomas;
    }

    public void setTomas(ArrayList<Integer> tomas) {
        this.tomas = tomas;
    }

    
    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
}
