package app.clase4.ejercicio1.ver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente implements Runnable {

    private String operacion;
    private String parametro1;
    private String parametro2;
    private String host;
    private int puerto;
    private int numero;

    public Cliente(String operacion, String parametro1, String parametro2, String host, int puerto, int numero) {
        this.operacion = operacion;
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
        this.host = host;
        this.puerto = puerto;
        this.numero = numero;
    }

    @Override
    public void run() {

        try {
            Socket socket = new Socket(this.host, this.puerto);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println(msg);
            out.println(operacion);
            System.out.println("cliente " + numero + " " + operacion);

            msg = in.readLine();
            System.out.println(msg);
            out.println(parametro1);
            System.out.println("cliente " + numero + " " + parametro1);

            msg = in.readLine();
            System.out.println(msg);
            out.println(parametro2);
            System.out.println("cliente " + numero + " " + parametro2);

            msg = in.readLine();
            System.out.println("cliente " + numero + " " + msg);

            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
