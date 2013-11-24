package app.clase4.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {

    public static void main(String[] args) {
        //LecturaEscritura.escribirArchivo();
        LecturaEscritura.leerArchivo();        
    }

    public static void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("C:\\JavaTecsup\\ejemplo1.txt");
            bw = new BufferedWriter(fw);
            bw.write("Jajajaj");
            bw.newLine();
            bw.write("Segundo jajajaja");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {
        FileReader fr = null;
        BufferedReader br = null;
        String sInput = null;
        try {
            fr = new FileReader("C:\\JavaTecsup\\ejemplo1.txt");
            br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
