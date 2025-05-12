import java.util.ArrayList;

public class Proveedor {
    private int dni;
    private String nombre;
    private int cuit;
    private ArrayList<OrdenCompra> ordenes;




    public Proveedor(int dni, String nombre, int cuit) {
        this.dni = dni;
        this.nombre = nombre;
        this.cuit = cuit;
        this.ordenes = new ArrayList<>();
    }

    public void agregar_orden(OrdenCompra orden){
        ordenes.add(orden);
    }

    public double Total_ordenes(){
        double total =0;
        for (OrdenCompra orden: ordenes){
            total += orden.calcular_total();
        }
        return total;
    }

    public ArrayList<OrdenCompra> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<OrdenCompra> ordenes) {
        this.ordenes = ordenes;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }
    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
}

