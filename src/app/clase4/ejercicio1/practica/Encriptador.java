package app.clase4.ejercicio1.practica;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encriptador {

    final static String palabrasecreta = "1234567812345678";

    public static String CifrarMensaje(String mensaje) throws Exception {

        byte[] mensajeBytes = palabrasecreta.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(mensajeBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encrypted = cipher.doFinal(mensaje.getBytes());

        return new String(encrypted);
    }

    public static String CifrarMensaje1(String mensaje) throws Exception {

        byte[] mensajeBytes = palabrasecreta.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(mensajeBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encrypted = cipher.doFinal(mensaje.getBytes());

        return new String(encrypted);
    }
    
    
    public static String DescifrarMensaje(String mensaje) throws Exception {

        byte[] mensajeBytes = palabrasecreta.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(mensajeBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decrypted = cipher.doFinal(mensaje.getBytes());
        return new String(decrypted);
    }
    
    public static String DescifrarMensaje2(String mensaje) throws Exception {

        byte[] mensajeBytes = palabrasecreta.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(mensajeBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding", "BC");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decrypted = cipher.doFinal(mensaje.getBytes());
        return new String(decrypted);
    }
}
