import implementacion.Estretegia_pila;

public class Main {
    public static void main(String[] args) {

        Estretegia_pila pila1 = new Estretegia_pila();
        pila1.IncializarPila();

        System.out.println(pila1.Tope());
        System.out.println(pila1.PilaVacia());

        pila1.Apilar(1);
        pila1.Apilar(2);
        pila1.Apilar(3);
        pila1.Apilar(4);
        pila1.Desapilar();
        pila1.Desapilar();

        System.out.println(pila1.Tope());
        System.out.println(pila1);



    }
}

