package app.clase4.ejercicio1.practica;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }

    public void ejecutar() {
        try {
            ServerSocket socketServer = new ServerSocket(puerto);

            while (true) {
                Socket socketCliente = socketServer.accept();
                AtendedorCliente atendedorCliente = new AtendedorCliente(socketCliente);
                atendedorCliente.start();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
