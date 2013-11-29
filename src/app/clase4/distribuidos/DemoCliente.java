package app.clase4.distribuidos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class DemoCliente {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("http://www.google.com", 80);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            
            out.println("GET /");
            
            while(true){
                String lee = in.readLine();
                if(lee==null){
                    break;
                }
                
                System.out.println(lee);
            }           
            
            in.close();
            out.close();
            s.close();
            
        } catch (Exception e) {
            System.out.println("error: " +  e.getMessage());
            e.printStackTrace();
        }
    }
}
