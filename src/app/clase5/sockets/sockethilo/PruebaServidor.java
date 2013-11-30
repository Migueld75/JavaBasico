package app.clase5.sockets.sockethilo;

public class PruebaServidor {

    public static void main(String[] args) {
        Servidor servidor = new Servidor(5000);
        servidor.ejecutar();
    }
}
