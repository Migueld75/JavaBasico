package app.clase3.excepcion;

public class Cuenta {

    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double retirarCajero(double montoretiro) throws SaldoInsuficienteException{
        if(montoretiro > this.saldo ){
            throw new SaldoInsuficienteException(this.saldo, montoretiro); 
        }
            
        this.saldo-=montoretiro;
        return this.saldo;
    }
}
