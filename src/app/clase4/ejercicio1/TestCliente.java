package app.clase4.ejercicio1;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("127.0.0.1", 99, "DIVISION", "1", "1");
        cliente.doConectar();
    }
}
