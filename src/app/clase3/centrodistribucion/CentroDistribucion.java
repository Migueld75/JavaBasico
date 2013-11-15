package app.clase3.centrodistribucion;

import java.util.ArrayList;

public abstract class CentroDistribucion {

    private String codigo;
    private String rUC;
    private String razonSocial;
    private String direccion;
    private ArrayList<String> telefonos;
    private Distrito distrito;

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public CentroDistribucion(String codigo, String rUC, String razonSocial, String direccion, ArrayList<String> telefonos, Distrito distrito) {
        this.codigo = codigo;
        this.rUC = rUC;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.distrito = distrito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getrUC() {
        return rUC;
    }

    public void setrUC(String rUC) {
        this.rUC = rUC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public void insertTelefono(int posicion, String telefono) {
        telefonos.add(posicion, telefono);
    }

    public void deleteTelefono(String telefono) {
        telefonos.remove(telefono);
    }

    public void newTelefono(String telefono) {
        telefonos.add(telefono);
    }

    public abstract void MostrarHorarioAtencion();
}
