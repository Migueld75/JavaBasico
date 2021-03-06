package app.clase4.ejercicio1.ver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    private String host;
    private int port;
    private String operacion;
    private String parametro1;
    private String parametro2;

    public Cliente(String host, int port, String operacion, String parametro1, String parametro2) {
        this.host = host;
        this.port = port;
        this.operacion = operacion;
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
            // Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            
            String msg = in.readLine();            
            System.out.println(msg);
            out.println(operacion);
            System.out.println(operacion);
            
            msg = in.readLine();
            System.out.println(msg);
            out.println(parametro1);
            System.out.println(parametro1);
            
            msg = in.readLine();
            System.out.println(msg);
            out.println(parametro2);
            System.out.println(parametro2);
            
            msg = in.readLine();
            System.out.println(msg);
            
            // Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
