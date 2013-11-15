package app.clase3.centrodistribucion;

public abstract class Persona {

    private String dNI;
    private String nombre;
    private String telefono;

    public Persona(String dNI, String nombre, String telefono) {
        this.dNI = dNI;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
