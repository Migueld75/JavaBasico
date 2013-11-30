package app.clase6.excepcion;

public class TestUtil {
    
    public static void main(String[] args) {
        try {
            Util.estaEnRango(10, 1, 20);
            Util.estaEnRango(10, 1, 5);
        } catch (FueraDeRangoExcepcion e) {
            System.out.println(e.getMessage());
        }        
    }
   
}
