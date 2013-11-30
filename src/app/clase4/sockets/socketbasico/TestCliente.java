package app.clase4.sockets.socketbasico;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("127.0.0.1", 99);
        cliente.doConectar();
    }
}
