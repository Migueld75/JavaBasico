package app.clase6.excepcion;

public class FueraDeRangoExcepcion extends Throwable {

    private int valor;
    private int desde;
    private int hasta;

    public FueraDeRangoExcepcion(int valor, int desde, int hasta) {
        this.valor = valor;
        this.desde = desde;
        this.hasta = hasta;
    }

    @Override
    public String getMessage() {
        return "Valor " + this.valor + " Fuera del rango : " + this.desde + " : " + this.hasta;
    }
}
