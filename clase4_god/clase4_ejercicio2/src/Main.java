import java.util.*;

public class Main {
    static ArrayList<Producto> productos = new ArrayList<>();
    static ArrayList<Proveedor> proveedores = new ArrayList<>();
    static int contadorOrden = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarDatos();

        int opcion=-1;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Alta de producto");
            System.out.println("2. Generar orden de compra");
            System.out.println("3. Consultar órdenes por proveedor");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Debe ingresar un número.");
                scanner.next();
                continue;
            }

            switch (opcion) {
                case 1 -> altaProducto(scanner);
                case 2 -> generarOrden(scanner);
                case 3 -> consultarOrdenes();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void inicializarDatos() {
        productos.add(new Producto(1, "Remera", 10000, 10));
        productos.add(new Producto(2, "Pantalón", 15000, 5));
        productos.add(new Producto(3, "Camisa", 12000, 8));

        proveedores.add(new Proveedor(20345678, "Carlos", 1004));
        proveedores.add(new Proveedor(20999887, "Pablo", 1002));
    }

    public static void altaProducto(Scanner scanner) {
        System.out.print("ID del producto: ");
        int id = leerEntero(scanner);
        scanner.nextLine(); // limpiar buffer
        System.out.print("Descripción: ");
        String desc = scanner.nextLine();
        System.out.print("Precio unitario: ");
        double precio = leerDouble(scanner);
        System.out.print("Stock: ");
        int stock = leerEntero(scanner);

        productos.add(new Producto(id, desc, precio, stock));
        System.out.println("Producto agregado correctamente.");
    }

    public static void generarOrden(Scanner scanner) {
        System.out.print("Ingrese DNI del proveedor: ");
        int dni = leerEntero(scanner);
        Proveedor proveedor = buscarProveedor(dni);
        if (proveedor == null) {
            System.out.println("Proveedor no encontrado.");
            return;
        }

        OrdenCompra orden = new OrdenCompra(contadorOrden++, new Date(), proveedor);
        System.out.print("¿Cuántos productos desea ingresar?: ");
        int n = leerEntero(scanner);

        for (int i = 0; i < n; i++) {
            System.out.print("Código de producto: ");
            int cod = leerEntero(scanner);
            Producto prod = buscarProducto(cod);
            if (prod == null) {
                System.out.println("Producto no encontrado.");
                continue;
            }

            System.out.print("Cantidad a comprar: ");
            int cantidad = leerEntero(scanner);
            if (cantidad > prod.getStock()) {
                System.out.println("Stock insuficiente.");
                continue;
            }

            orden.agregarProducto(prod, cantidad);
        }

        proveedor.agregar_orden(orden);
        System.out.println("Orden de compra generada correctamente.");
    }

    public static void consultarOrdenes() {
        System.out.println("\n--- Consulta de órdenes ---");
        for (Proveedor p : proveedores) {
            System.out.println("Proveedor: " + p.getNombre() +
                    " | Total órdenes: $" + p.Total_ordenes());
        }
    }

    public static Proveedor buscarProveedor(int dni) {
        for (Proveedor p : proveedores) {
            if (p.getDni() == dni) return p;
        }
        return null;
    }

    public static Producto buscarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un número entero.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double leerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Debe ingresar un número válido.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
