//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alumno alumno1= new Alumno();
        Alumno alumno2 = new Alumno(2,"luana","sole");

        System.out.println("el nombre es: "+ alumno2.getNombre());
        System.out.println("el id del alumno 2 es: "+ alumno2.getId());
        System.out.println("el apellido es: "+ alumno2.getApellido());

        alumno1.setId(8); //coloco datos
        alumno1.setNombre("sol");
        alumno1.setApellido("carboni");

        System.out.println("------------------------");

        System.out.println("el nombre es: "+ alumno1.getNombre());
        System.out.println("el id del alumno 1 es: "+ alumno1.getId());
        System.out.println("el apellido es: "+ alumno1.getApellido());

        System.out.println("------------------------");

        alumno2.setId(35);//cambio de valor

        System.out.println("el nombre es: "+ alumno2.getNombre());
        System.out.println("el id del alumno 2 es: "+ alumno2.getId());
        System.out.println("el apellido es: "+ alumno2.getApellido());
// --------encapsulamiento ----------------
        //puedo hacer esto gracias a mis metodso publicos
        Alumno alumnovacio = new Alumno();
        Alumno alumno3 = new Alumno(15,"CLARA","carboni");
// lo puede hacer porque mis getters a setters son publicos, si los cambio a privado no puedo acceder
        System.out.println("el nombre es: "+ alumno3.getNombre());
        System.out.println("el id del alumno 2 es: "+ alumno3.getId());
        System.out.println("el apellido es: "+ alumno3.getApellido());


    }
}