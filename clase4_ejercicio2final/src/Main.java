import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Instanciar el sistema de compras
        SistemaCompras sistema = new SistemaCompras();

        // Dar de alta productos (sin manejo de stock)
        Producto p1 = new Producto("P001", "Lapicera", 50.0);
        Producto p2 = new Producto("P002", "Cuaderno", 120.0);
        Producto p3 = new Producto("P003", "Regla", 80.0);
        sistema.altaProducto(p1);
        sistema.altaProducto(p2);
        sistema.altaProducto(p3);

        // Dar de alta proveedores
        Proveedor prov1 = new Proveedor("12345678", "Clara");
        Proveedor prov2 = new Proveedor("87654321", "Magui");
        sistema.altaProveedor(prov1);
        sistema.altaProveedor(prov2);


        String fechaHoy = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        // Generar órdenes de compra
        // Cada orden se compone de: fecha, proveedor (identificado por el dni), producto (por código) y cantidad
        sistema.generarOrden("12345678", fechaHoy, "P001", 3); // 3 Lapiceras para clara
        sistema.generarOrden("12345678", fechaHoy, "P002", 2); // 2 Cuadernos para clara
        sistema.generarOrden("87654321", fechaHoy, "P003", 1); // 1 Regla para magui


        // Consultar las órdenes de compra de un proveedor (por su dni)
        System.out.println("--- Órdenes de Compra para proveedor clara ---");
        sistema.consultarOrdenesPorProveedor("87654321");
    }
}

