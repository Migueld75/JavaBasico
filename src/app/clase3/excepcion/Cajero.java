package app.clase3.excepcion;

public class Cajero {
    public static void main(String[] args) {
        Cuenta cuentaJose = new Cuenta("Jose", 5000);
        try {
            System.out.println("Retiro: " + cuentaJose.retirarCajero(3000));
            System.out.println("Retiro: " + cuentaJose.retirarCajero(3000));        
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            //Muestra en consola la clase y el e.getMessage();
            System.err.println(e); 
            // Muestra en consola el numero de linea de error
            e.printStackTrace(); 
        }
        
    }
        
}
