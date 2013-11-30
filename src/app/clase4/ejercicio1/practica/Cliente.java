package app.clase4.ejercicio1.practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {

    private String ip;
    private int puerto;
    private String operacion;
    private String parametro1;
    private String parametro2;
    private int numero;

    public Cliente(String ip, int puerto, String operacion, String parametro1, String parametro2, int numero) {
        this.ip = ip;
        this.puerto = puerto;
        this.operacion = operacion;
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
        this.numero = numero;
    }

    @Override
    public void run() {
        Socket socket;
        try {
            socket = new Socket(this.ip, this.puerto);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String mensaje = in.readLine();
            mensaje = Encriptador.DescifrarMensaje(mensaje);
            
            out.println(Encriptador.CifrarMensaje(this.operacion));
            System.out.println("Cliente " + this.numero  + " " + mensaje + " " + this.operacion);

            mensaje = in.readLine();            
            mensaje = Encriptador.DescifrarMensaje(mensaje);
            out.println(Encriptador.CifrarMensaje(parametro1));
            System.out.println("Cliente " + this.numero  + " " + mensaje + " " + this.parametro1);

            mensaje = in.readLine();
            mensaje = Encriptador.DescifrarMensaje(mensaje);
            out.println(Encriptador.CifrarMensaje(parametro2));
            System.out.println("Cliente " + this.numero  + " " + mensaje + " " + this.parametro2);

            mensaje = in.readLine();            
            mensaje = Encriptador.DescifrarMensaje(mensaje);
            System.out.println("Cliente " + this.numero  + " " + mensaje);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());;
        }
    }

}
