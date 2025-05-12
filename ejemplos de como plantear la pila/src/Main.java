
//estrategia 1
//se tienen un arreglo y una variable entera, que indica la cantidad de elementos de la pila.
// Cuando se agrega un nuevo elemento,se lo coloca en la posición indicada por la variable y
// ésta se incrementa en uno; cuando se lo elimina,se decrementa simplemente la variable en uno
//  El valor de la variable apunta a la primera posición libre del arreglo.

public class Pila1 {
    int[] elementos;
    int tope;

    public void InicializarPila() {
        elementos = new int[100];
        tope = 0;
    }

    public void Apilar(int x) {
        elementos[tope] = x; //se agrega en la posicion tope
        tope++;               // se incrementa
    }

    public void Desapilar() {
        if (tope > 0) {
            tope--;
        }
    }

    public int Tope() {
        return elementos[tope - 1];
    }

    public boolean PilaVacia() {
        return tope == 0;
    }
}

//estrategia 2
//se tienen también un arreglo y una variable entera, que indica la cantidad de elementos de la pila.
// Cuando se agrega un nuevo elemento, se lo coloca en la primera posición del arreglo,
// luego de haber desplazado todos los otros elementos hacia la derecha una posición y la variable se incrementa en uno;
// cuando se lo elimina, se efectúa un desplazamiento hacia la izquierda y se decrementa la variable en uno.
// El valor de la variable apunta a la última posición ocupada del arreglo (el tope de la pila.)

public class Pila2 {
    int[] elementos;
    int tope;

    public void InicializarPila() {
        elementos = new int[100];
        tope = 0;
    }

    public void Apilar(int x) {
        for (int i = tope; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = x;
        tope++;
    }

    public void Desapilar() {
        if (tope > 0) {
            for (int i = 0; i < tope - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tope--;
        }
    }

    public int Tope() {
        return elementos[0];
    }

    public boolean PilaVacia() {
        return tope == 0;
    }
}


//se utiliza la primera posición del arreglo para indicar la cantidad de elementos.
// El valor de la posición 0 apunta a la última posición ocupada del arreglo.

public class Pila3 {
    int[] elementos;

    public void InicializarPila() {
        elementos = new int[101]; // 0 guarda cantidad
        elementos[0] = 0;
    }

    public void Apilar(int x) {
        elementos[elementos[0] + 1] = x;
        elementos[0]++;
    }

    public void Desapilar() {
        if (elementos[0] > 0) {
            elementos[0]--;
        }
    }

    public int Tope() {
        return elementos[elementos[0]];
    }

    public boolean PilaVacia() {
        return elementos[0] == 0;
    }
}


