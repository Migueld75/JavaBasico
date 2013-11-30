package app.clase4.ejercicio1.practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtendedorCliente extends Thread {

    private Socket socket;

    public AtendedorCliente(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println(Encriptador.CifrarMensaje("Ingrese una operacion (SUMAR, RESTAR, MULTIPLICAR, RESTAR): "));
            String operacion = in.readLine();
            operacion = Encriptador.DescifrarMensaje(operacion);

            out.println(Encriptador.CifrarMensaje("Ingrese primer parametro: "));
            String parametro1 = in.readLine();
            operacion = Encriptador.DescifrarMensaje(parametro1);

            out.println(Encriptador.CifrarMensaje("Ingrese segundo parametro: "));
            String parametro2 = in.readLine();
            operacion = Encriptador.DescifrarMensaje(parametro2);

            int resultado = 0;

            try {
                switch (operacion) {
                    case "SUMAR":
                        resultado = OperadorAritmetico.sumar(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                        break;
                    case "RESTAR":
                        resultado = OperadorAritmetico.restar(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                        break;
                    case "MULTIPLICAR":
                        resultado = OperadorAritmetico.multiplicar(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                        break;
                    case "DIVIDIR":
                        resultado = OperadorAritmetico.dividir(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                        break;
                    default:
                        break;
                }                
                out.println(Encriptador.CifrarMensaje("Resultado: " + resultado));                
            } catch (Exception e) {
                out.println(e.getMessage());
            }
            
            



            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
