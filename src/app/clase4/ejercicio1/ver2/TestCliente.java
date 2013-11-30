package app.clase4.ejercicio1.ver2;

public class TestCliente {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("SUMAR", "1", "2", "127.0.0.1", 2000,1);
        Cliente cliente2 = new Cliente("RESTAR", "2", "1", "127.0.0.1", 2000,2);
        Cliente cliente3 = new Cliente("MULTIPLICAR", "2", "3", "127.0.0.1", 2000,3);
        Cliente cliente4 = new Cliente("DIVIDIR", "27", "3", "127.0.0.1", 2000,4);

        Thread t1 = new Thread(cliente1);
        Thread t2 = new Thread(cliente2);
        Thread t3 = new Thread(cliente3);
        Thread t4 = new Thread(cliente4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
