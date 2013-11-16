package app.clase4.practica.granjaganadera;

import java.util.ArrayList;

public class Alimento {

    private String nombre;
    private TipoAlimento tipoAlimento;
    private String unidadMedida;
    private double costoPorUnidadMedida;
    private float valorNutricional;
    private ArrayList<Nutriente> nutrientes;

    public Alimento(String nombre, TipoAlimento tipoAlimento, String unidadMedida, double costoPorUnidadMedida, float valorNutricional, ArrayList<Nutriente> nutrientes) {
        this.nombre = nombre;
        this.tipoAlimento = tipoAlimento;
        this.unidadMedida = unidadMedida;
        this.costoPorUnidadMedida = costoPorUnidadMedida;
        this.valorNutricional = valorNutricional;
        this.nutrientes = nutrientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAlimento getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(TipoAlimento tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getCostoPorUnidadMedida() {
        return costoPorUnidadMedida;
    }

    public void setCostoPorUnidadMedida(double costoPorUnidadMedida) {
        this.costoPorUnidadMedida = costoPorUnidadMedida;
    }

    public float getValorNutricional() {
        return valorNutricional;
    }

    public void setValorNutricional(float valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    public ArrayList<Nutriente> getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(ArrayList<Nutriente> nutrientes) {
        this.nutrientes = nutrientes;
    }
}
