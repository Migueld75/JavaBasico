package app.clase3.interfaces.capital;

public class Oracion implements Capitalizable {

    String texto;

    Oracion(String n) {
        texto = n;
    }

    public String agregaPalabra(String t) {
        texto = texto.concat(" " + t);
        return texto;
    }

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
}
