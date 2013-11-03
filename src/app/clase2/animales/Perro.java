package app.clase2.animales;

public class Perro extends Animal{

    public Perro(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau Guau!!!");
    }
    
    
}
