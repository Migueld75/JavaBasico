package app.clase3.interfaces.posicion;

public class Teodolito {

    public static void main(String[] args) {
        Posicion auto = new Auto(10,20);
        Posicion persona = new Persona(20,10);
        
        
        
        Teodolito.getDistancia(auto, persona);
    }
    
    
    public static void getDistancia(Posicion p1, Posicion p2) {
        double d1 = p1.getLatitud()- p2.getLatitud();
        double d2 = p1.getLongitud() - p2.getLongitud();
    
        double result = Math.sqrt(d1*d1+d2*d2); //pagina 105 del manual
        
        System.out.println(result);
    }
}

