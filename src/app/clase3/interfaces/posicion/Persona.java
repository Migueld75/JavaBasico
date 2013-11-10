package app.clase3.interfaces.posicion;

public class Persona implements Posicion{

    private String sexo;
    private String nombre;
    private double longitud;
    private double latitud;

    public Persona() {
        this.longitud = 20d;
        this.latitud = 10d;
    }

    public Persona(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getLongitud() {
        return this.longitud;
    }

    @Override
    public double getLatitud() {
        return this.latitud;
    }
}
