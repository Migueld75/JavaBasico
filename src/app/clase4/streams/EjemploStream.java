package app.clase4.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjemploStream {
    private List<String> lineas;
    private String fileName;

    public EjemploStream(String fileName) {
        this.lineas = new ArrayList<String>();
        this.fileName = fileName;
    }
    
    public static void main(String[] args) {
        EjemploStream es = new EjemploStream("C:\\JavaTecsup\\ejemplo1.txt");
        es.actualizarDatos();
    }
    
    public void actualizarDatos() {
        leerDatos();
        guardarDatos();
    }
    
    public void guardarDatos(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(this.fileName);
            bw = new BufferedWriter(fw);
            
            for (String linea : this.lineas) {
                bw.write(linea);
                bw.newLine();
            }
            
            bw.write("Nueva tercera linea");
            bw.newLine();
            bw.write("Nueva cuarta linea");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void leerDatos(){
        FileReader fr = null;
        BufferedReader br = null;
        String sInput = null;
        try {
            fr = new FileReader(this.fileName);
            br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                this.lineas.add(sInput);
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
