import Interfaz.ColaTDA;
import Implementacion.Estatregia1;
public class Main {
    public static void main(String[] args) {
        //Crear las colas
        ColaTDA Cola1 = new Estatregia1();
        ColaTDA Cola2 = new Estatregia1();

        //Inicialiar las colas
        Cola1.IncializarCola();
        Cola2.IncializarCola();

        //Acolar elemntos en la cola1
        for (int i=1;i<=10;i++){
            System.out.println("Encolando en Cola 1: " + i);
            Cola1.Acolar(i);
        }

        //Pasar de Cola1 a Cola2
        //Uso un while para que sea generico. No importa la cant de elementos
        while (!Cola1.ColaVacia()){
            int elemento = Cola1.Primero();
            System.out.println("Elemento  que se esta pasando a la otra cola: " + elemento);
            Cola1.Desacolar();
            Cola2.Acolar(elemento);
        }

        //Mostrar elementos de Cola1
        System.out.println("Elementos de Cola1 al final:");
        while (!Cola1.ColaVacia()){
            System.out.println(Cola1.Primero());
            Cola1.Desacolar();
        }

        //Mostrando elemtos de la Cola2
        System.out.println("Elemtos de la Cola2 al final: ");
        while (!Cola2.ColaVacia()){
            System.out.println(Cola2.Primero());
            Cola2.Desacolar();
        }
    }
}