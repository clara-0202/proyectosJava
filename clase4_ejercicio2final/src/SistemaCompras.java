import java.util.ArrayList;
import java.util.List;

class SistemaCompras {
    private List<Producto> productos = new ArrayList<>();
    private List<Proveedor> proveedores = new ArrayList<>();
    private List<OrdenCompra> ordenes = new ArrayList<>();

    public void altaProducto(Producto p) {
        productos.add(p);
    }

    public void altaProveedor(Proveedor p) {
        proveedores.add(p);
    }

    public Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) return p;
        }
        return null;
    }

    public Proveedor buscarProveedor(String dni) {
        for (Proveedor p : proveedores) {
            if (p.getDni().equals(dni)) return p;
        }
        return null;
    }

    public void generarOrden(String dniProveedor, String fecha, String codigoProducto, int cantidad) {
        Proveedor proveedor = buscarProveedor(dniProveedor);
        Producto producto = buscarProducto(codigoProducto);

        if (proveedor != null && producto != null) {
            ordenes.add(new OrdenCompra(fecha, proveedor, producto, cantidad));
        } else {
            System.out.println("Proveedor o producto no encontrado.");
        }
    }

    public void consultarOrdenesPorProveedor(String dni) {
        double total = 0;
        for (OrdenCompra o : ordenes) {
            if (o.getProveedor().getDni().equals(dni)) {
                System.out.println("Orden N°" + o.getNumero() + " Total: $" + o.getTotal());
                total += o.getTotal();
            }
        }
        Proveedor p = buscarProveedor(dni);
        if (p != null) {
            System.out.println("Proveedor: " + p.getNombre() + " | Total de órdenes: $" + total);
        }
    }
}