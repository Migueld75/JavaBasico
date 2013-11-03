package app.clase2.animales;

public class Tigre extends Animal {

    public Tigre(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    //la notacion puede como no puede ir
    @Override
    public void hacerRuido() {
        System.out.println("grrrrr");
    }
    
                
}
