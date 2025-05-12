import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private int numero;
    private Date fecha;
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Integer> cantidades = new ArrayList<>();
    private Proveedor proveedor;

    public OrdenCompra(int numero, Date fecha, Proveedor proveedor) {
        this.numero = numero;
        this.fecha = fecha;
        this.proveedor = proveedor;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.add(producto);
        cantidades.add(cantidad);
        producto.descontar_stock(cantidad);
    }

    public double calcular_total() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecioUnitario() * cantidades.get(i);
        }
        return total;
    }
}
