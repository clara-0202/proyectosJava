public class Jefe extends Persona {
    int idJefe;
    String departamentoJefe;

    public Jefe() {
    }

    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int idJefe, String departamentoJefe) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }
}
