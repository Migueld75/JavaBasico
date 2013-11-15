package app.clase3.centrodistribucion;

public class Compra {

    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    private CentroDistribucion centroDistribucion;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void CompraProductoPersonal(CentroDistribucion centroDistribucion, Cliente cliente, Producto producto, int cantidad) {
        this.centroDistribucion = centroDistribucion;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        
        System.out.println("Cliente: " + this.cliente.getNombre());
        System.out.println("Producto: " + this.producto.getDescripcion());
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Monto a pagar: " + this.producto.getPrecio() * this.cantidad);
    }

    public void CompraMedicamento(CentroDistribucion centroDistribucion, Cliente cliente, RecetaMedica recetaMedica) {
        this.centroDistribucion = centroDistribucion;
        this.cliente = cliente;
        this.producto = recetaMedica.getMedicamento();
        this.cantidad = recetaMedica.getCantidad();

        System.out.println("Cliente: " + this.cliente.getNombre());
        System.out.println("Producto: " + this.producto.getDescripcion());
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Monto a pagar: " + this.producto.getPrecio() * this.cantidad);
    }
}
