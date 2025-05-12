public class Consultor extends Persona{
    String nombreDeConsultora;
    int numeroConsultor;

    public Consultor() {
    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombreDeConsultora, int numeroConsultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombreDeConsultora = nombreDeConsultora;
        this.numeroConsultor = numeroConsultor;
    }

    public String getNombreDeConsultora() {
        return nombreDeConsultora;
    }

    public void setNombreDeConsultora(String nombreDeConsultora) {
        this.nombreDeConsultora = nombreDeConsultora;
    }

    public int getNumeroConsultor() {
        return numeroConsultor;
    }

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }
}
