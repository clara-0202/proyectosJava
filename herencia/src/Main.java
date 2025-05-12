//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        empleado1.getNumLegajo();
        empleado1.getNombre();

        Consultor consultor1 = new Consultor();
        consultor1.getNumeroConsultor();
        consultor1.getNombre();
       //----------------------------------------------
       //voy a guardar mis clases en un vector
       Persona vector [] = new Persona[5];
       vector[0] = new Persona();
       vector[1] = new Empleado();
       vector[2] = new Consultor();
       vector[3] = new Jefe();

       Persona persona= new Persona();
       Consultor consultor = new Consultor();
       persona= consultor;
       consultor = persona;// esto no se puede porque persona no hereda consultor

        //System.out.println()= sout atajooo



    }
}