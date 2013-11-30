package app.clase4.ejercicio1.ver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class AtendedorSolicitud extends Thread {

    private Socket socket;
    private OperadorAritmetico operadorAritmetico;

    public AtendedorSolicitud(Socket socket, OperadorAritmetico operadorAritmetico) {
        this.socket = socket;
        this.operadorAritmetico = operadorAritmetico;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Ingrese operacion (SUMAR, RESTAR, MULTIPLICAR, DIVIDIR)");
            String operacion = in.readLine();
            System.out.println(operacion);

            out.println("Ingrese primer parametro: ");
            String parametro1 = in.readLine();
            System.out.println(parametro1);

            out.println("Ingrese segundo parametro: ");
            String parametro2 = in.readLine();
            System.out.println(parametro2);

            int resultadoOperacion=0;
            switch (operacion.toUpperCase()) {
                case "SUMAR":
                    resultadoOperacion = operadorAritmetico.sumar(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                    break;
                case "RESTAR":
                    resultadoOperacion = operadorAritmetico.restar(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                    break;
                case "MULTIPLICAR":
                    resultadoOperacion = operadorAritmetico.multiplicar(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                    break;
                case "DIVIDIR":
                    resultadoOperacion = operadorAritmetico.dividir(Integer.parseInt(parametro1), Integer.parseInt(parametro2));
                    break;
                default: break;
            }
            
            out.println("resultado: " + resultadoOperacion);
            System.out.println("resultado: " + resultadoOperacion);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}