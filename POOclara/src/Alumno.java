public class Alumno {
    private int id; //atributos
    private String nombre;//atributos
    private String apellido;//atributos


    public Alumno() {// contructor vacio
    }

    public Alumno(int id, String nombre, String apellido) { //contructores
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {//ver los datos
        return id;
    }

    public void setId(int id) {// coloco o elimino dato
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre(){
        System.out.println("hola soy un alumno y se decir mi nombre");
    }
    public void saberAprobado(double calificacion){
        if (calificacion>=6){
            System.out.println("aprobe la materia");
        }else{
            System.out.println("no aprobeee");
        }
    }
}
