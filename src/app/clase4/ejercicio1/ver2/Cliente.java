package app.clase4.ejercicio1.ver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente implements Runnable {

    private String operacion;
    private String parametro1;
    private String parametro2;
    private String host;
    private int puerto;

    public Cliente(String operacion, String parametro1, String parametro2, String host, int puerto) {
        this.operacion = operacion;
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
        this.host = host;
        this.puerto = puerto;
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

            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
