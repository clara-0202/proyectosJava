public class Empleado extends Persona {
    int numLegajo;
    String cargo;
    double sueldo;

    public Empleado(){

    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int numLegajo, String cargo, double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }



    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
