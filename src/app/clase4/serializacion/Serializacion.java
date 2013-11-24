package app.clase4.serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacion {

    public static void main(String[] args) {
        Serializacion.SerializarPersona();
    }
    
    public static void SerializarPersona() {
        FileOutputStream archivo = null;
        ObjectOutputStream salida = null;
        Persona p1 = new Persona("Juan", 10 );
        try {
            archivo = new FileOutputStream("C:\\Persona.txt");
            salida = new ObjectOutputStream(archivo);
            salida.writeObject(p1);
            salida.flush();
        } catch (IOException e) {
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                salida.close();
            } catch (IOException e) {
                System.out.println("No pudo cerrarse el canal");
                e.printStackTrace();
            }
        }
    }
}
