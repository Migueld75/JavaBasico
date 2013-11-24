package app.clase4.streams;

import java.io.File;

public class EntradaSalida {

    public static void main(String[] args) {
        //EntradaSalida.verifyFile();
        //EntradaSalida.listarDirectorio();
        EntradaSalida.CreteDirectorio();
    }

    public static void verifyFile() {
        File file = new File("C:\\temario.txt");

        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta : " + file.getPath());
        System.out.println("Ruta Absoluta: " + file.getAbsolutePath());

        if (file.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((file.canRead()) ? "Sí se puede leer" : "");
            System.out.println((file.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + file.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
        }

    }

    public static void listarDirectorio() {
        File directorio = new File("C:\\ ");
        if ((directorio.exists()) && (directorio.isDirectory())) {
            String[] lista = directorio.list();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
    
    public static void CreteDirectorio(){
        File dir = new File("c:\\javaTecsup");
        
        if(!dir.isDirectory() && !dir.exists()){
            dir.mkdir();
        }
    }
}
