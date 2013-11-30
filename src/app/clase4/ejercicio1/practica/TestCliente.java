package app.clase4.ejercicio1.practica;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("127.0.0.1", 5000, "SUMAR", "1", "1", 1);
        Cliente cliente2 = new Cliente("127.0.0.1", 5000, "RESTAR", "2", "2", 2);
        Cliente cliente3 = new Cliente("127.0.0.1", 5000, "MULTIPLICAR", "22", "22", 3);
        Cliente cliente4 = new Cliente("127.0.0.1", 5000, "DIVIDIR", "33", "3", 4);
        
        Thread hilo1 = new Thread(cliente1);
        Thread hilo2 = new Thread(cliente2);
        Thread hilo3 = new Thread(cliente3);
        Thread hilo4 = new Thread(cliente4);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }

}
