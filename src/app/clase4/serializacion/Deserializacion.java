package app.clase4.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializacion {

    public static void main(String[] args) {
        Deserializacion.DeserializarPersona();
    }

    public static void DeserializarPersona() {
        File archivo = new File("C:\\Persona.txt");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona p1 = (Persona) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Persona recuperada: " + p1.toString());
        } catch (IOException e) {
            System.err.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }
    }
}
