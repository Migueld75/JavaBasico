package app.clase6.excepcion;

public class Util {

    public static void estaEnRango(int valor, int desde, int hasta) throws FueraDeRangoExcepcion {
        if (valor >= desde && valor <= hasta) {
            System.out.println("Valor " + valor + " Dentro del rango : " + desde + " : " + hasta);
        } else {
            throw new FueraDeRangoExcepcion(valor, desde, hasta);
        }

    }
}
