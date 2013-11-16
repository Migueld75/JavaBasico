package app.clase4.practica.granjaganadera;

public class Especie {

    private String codigo;
    private String nombreEspecie;

    public Especie(String codigo, String nombreEspecie) {
        this.codigo = codigo;
        this.nombreEspecie = nombreEspecie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }
}
