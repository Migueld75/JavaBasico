package app.clase4.ejercicio1.ver2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }

    public void ejecutar() {
        try {
            System.out.println("Iniciando servidor");
            ServerSocket serversocket = new ServerSocket(this.puerto);

            while (true) {
                Socket clientesocket = serversocket.accept();
                
                OperadorAritmetico operador = new OperadorAritmetico();
                AtendedorSolicitud atendedor = new AtendedorSolicitud(clientesocket, operador);                
                atendedor.start();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
