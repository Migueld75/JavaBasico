package app.clase4.ejercicio1.ver1;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("127.0.0.1", 99, "SUMA", "1", "1");
        cliente.doConectar();
        
        cliente = new Cliente("127.0.0.1", 99, "RESTA", "1", "1");
        cliente.doConectar();
        
        
        cliente = new Cliente("127.0.0.1", 99, "MULTIPLICACION", "1", "1");
        cliente.doConectar();
        
        cliente = new Cliente("127.0.0.1", 99, "DIVISION", "1", "1");
        cliente.doConectar();
    }
}
