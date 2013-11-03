package app.clase2.animales;

public class Zoologico {
    public static void main(String[] args) {
        Tigre diego = new Tigre("Diego", 20);
        diego.hacerRuido();
        diego.hacerRuido(true);
        diego.comer();
        
        Perro tobi = new Perro("Tobi", 12);
        tobi.hacerRuido();
        tobi.comer();
        
        Vicuna robi = new Vicuna();
        robi.hacerRuido();
        robi.comer();
    }
}