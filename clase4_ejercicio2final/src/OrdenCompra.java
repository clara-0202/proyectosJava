
class OrdenCompra {
    private static int contador = 1;
    private int numero;
    private String fecha;
    private Proveedor proveedor;
    private Producto producto;
    private int cantidad;

    public OrdenCompra(String fecha, Proveedor proveedor, Producto producto, int cantidad) {
        this.numero = contador++;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return cantidad * producto.getPrecioUnitario();
    }

    public Proveedor getProveedor() { return proveedor; }
    public double getTotal() { return calcularTotal(); }
    public int getNumero() { return numero; }
}

