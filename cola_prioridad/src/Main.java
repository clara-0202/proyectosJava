public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new Cola();
        cola.InicializarCola();

        // Acolamos elementos con distintas prioridades
        cola.AcolarPrioridad(10, 2); // Elemento 10, prioridad 2
        cola.AcolarPrioridad(20, 5); // Elemento 20, prioridad 5
        cola.AcolarPrioridad(30, 1); // Elemento 30, prioridad 1
        cola.AcolarPrioridad(40, 3); // Elemento 40, prioridad 3



        while (!cola.ColaVacia()) {
            System.out.println("Elemento: " + cola.Primero() + " | Prioridad: " + cola.Prioridad());
            cola.Desacolar(); // Saco el primer elemento (el de mayor prioridad)

        }
    }
}