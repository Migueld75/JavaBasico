package app.clase4.ejercicio1.practica;

import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;

public class TestEncriptador {

    public static void main(String[] args) throws Exception {
        try {

            String mensaje = "Hola mundo";
            System.out.println(mensaje);

            String mensajecifrado = Encriptador.CifrarMensaje(mensaje);
            System.out.println(mensajecifrado);

            String mensajedescifrado = Encriptador.DescifrarMensaje(mensajecifrado);
            System.out.println(mensajedescifrado);

        } catch (BadPaddingException | InvalidKeyException e) {
            System.out.println(e.getMessage());
        }

    }

}
