package app.clase3.centrodistribucion;

import java.util.Date;

public class RecetaMedica {

    private Date fechaEmision;
    private Date fechaVencimiento;
    private Medicamento medicamento;

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    private int cantidad;
    private Medico medico;

    public RecetaMedica(Date fechaEmision, Date fechaVencimiento, Medicamento medicamento, int cantidad, Medico medico) {
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.medico = medico;
    }    

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
