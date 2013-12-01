package app.clase6.abejas;

public abstract class Hymenoptera {

    private int cantidadPatas;
    private int cantidadAlas;
    private String sexo;
    private String comida;

    public Hymenoptera(int cantidadPatas, int cantidadAlas, String sexo, String comida) {
        this.cantidadPatas = cantidadPatas;
        this.cantidadAlas = cantidadAlas;
        this.sexo = sexo;
        this.comida = comida;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public int getCantidadAlas() {
        return cantidadAlas;
    }

    public void setCantidadAlas(int cantidadAlas) {
        this.cantidadAlas = cantidadAlas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
