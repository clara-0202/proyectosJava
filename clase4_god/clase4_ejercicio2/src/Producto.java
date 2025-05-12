public class Producto {
    private int id;
    private String descripcion;
    private  double precio_unitario;
    private int stock;

    public Producto(int id, String descripcion, double precio_unitario, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.stock=stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precio_unitario;
    }

    public void setPrecioUnitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void descontar_stock(int cantidad){
        this.stock -= cantidad;
    }
}
