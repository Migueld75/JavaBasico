package app.clase3.centrodistribucion;

public class Medico extends Persona {

    private String numeroLicencia;
    private int anioGraduado;

    public Medico(String dNI, String nombre, String telefono, String numeroLicencia, int anioGraduado) {
        super(dNI, nombre, telefono);
        this.numeroLicencia = numeroLicencia;
        this.anioGraduado = anioGraduado;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public int getAnioGraduado() {
        return anioGraduado;
    }

    public void setAnioGraduado(int anioGraduado) {
        this.anioGraduado = anioGraduado;
    }

}
