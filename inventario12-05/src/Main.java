import implementaciones.ColaDinamica;
import implementaciones.DiccionarioSimple;
import implementaciones.DicionarioMultiple;



public class Main {
    public static void main(String[] args){

        // Creamos el diccionario simple de productos
        DiccionarioSimple datosProductos = new DiccionarioSimple();
        datosProductos.inicializar_diccionario();

        // Creamos el diccionario multiple de detalles
        DicionarioMultiple detalles = new DicionarioMultiple();
        detalles.inicializar_diccionario();

        // Creamos la cola dinamica de llegada
        ColaDinamica llegada = new ColaDinamica();
        llegada.InicializarCola();


        // cargar a datosProductos el precio
        // cargar a detalles el nombre y descripcion
        // sumar a cola dinamica el orden
        Integer cod1= 3, cod2= 6, cod3=5;

        datosProductos.agregar(3,456);
        detalles.agregar(cod1,"Pantalon");
        detalles.agregar(cod1, "Jean Chupin Re de moda");
        llegada.Acolar(cod1);


        datosProductos.agregar(6,432);
        detalles.agregar(cod2, "Cartera");
        detalles.agregar(cod2, "Prune Negra re unica");
        llegada.Acolar(cod2);

        datosProductos.agregar(5,656);
        detalles.agregar(cod3, "Gorra");
        detalles.agregar(cod3, "boston verde");
        llegada.Acolar(cod3);


        // Probar consultas
        System.out.println("Probando datosProductos");
        System.out.println(datosProductos.recuperar((cod1)));
        System.out.println(datosProductos.obtener_claveToString());
        datosProductos.eliminar(cod1);
        System.out.println(datosProductos.obtener_claveToString());


        System.out.println("\n");
        System.out.println("Probando detalles");
        System.out.println(detalles.recuperar(cod3));
        System.out.println(detalles.obtener_clavesToString());
        detalles.eliminar_valor(cod3, "boston verde");
        System.out.println(detalles.recuperar(cod3));
        detalles.eliminar(cod3);


        System.out.println("\n");
        System.out.println("Probando cola dinamica");
        System.out.println(llegada.Primero());
        llegada.Desacolar();
        System.out.println(llegada.Primero());

    }

}
