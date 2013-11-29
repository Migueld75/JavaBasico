package app.clase4.ejercicio1.ver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port;
    private OperacionAritmetica operacionAritmetica;

    public Servidor(int port) {
        this.port = port;
        operacionAritmetica = new OperacionAritmetica();
    }

    public void ejecutar() {
        try {
            // Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            while (true) {
                Socket cliente = server.accept();
                // Crear los canales de lectura y escritura
                PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                
                out.println("Ingrese Operacion: ");                                
                String resp = in.readLine();
                System.out.println(resp);
                
                out.println("Ingrese primer parametro: "); 
                String parametro1 = in.readLine();
                System.out.println(parametro1);
                
                out.println("Ingrese segundo parametro: "); 
                String parametro2 = in.readLine();
                System.out.println(parametro2);
                
                long resultado = 0;
                
                switch(resp.toUpperCase()){                    
                    case "SUMA":  
                        resultado = operacionAritmetica.sumar(Long.parseLong(parametro1), Long.parseLong(parametro2));
                        break;
                    case "RESTA":  
                        resultado = operacionAritmetica.restar(Long.parseLong(parametro1), Long.parseLong(parametro2));
                        break;
                    case "MULTIPLICACION":  
                        resultado = operacionAritmetica.multiplicacion(Long.parseLong(parametro1), Long.parseLong(parametro2));
                        break;
                    case "DIVISION":  
                        resultado = operacionAritmetica.division(Long.parseLong(parametro1), Long.parseLong(parametro2));
                }
                
                out.println("Resultado: " + resultado); 
                System.out.println("Resultado: " + resultado);
                /* Cerramos el canal */
                in.close();
                out.close();
                cliente.close();
            }            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
