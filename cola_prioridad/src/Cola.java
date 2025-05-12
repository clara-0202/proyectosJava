public class Cola implements ColaPrioridadTDA {
    private int elementos[];
    private int prioridades[];

    @Override
    public void InicializarCola() {
        elementos = new int[100];
        prioridades = new int[100];
        elementos[0] = 0;
    }

    @Override
    public void AcolarPrioridad(int x, int prioridad) {
        int i = elementos[0];

        // Buscar la posición correcta para insertar según la prioridad
        while (i > 0 && prioridad > prioridades[i]) {
            elementos[i + 1] = elementos[i];
            prioridades[i + 1] = prioridades[i];
            i--;
        }

        // Insertar el nuevo elemento en la posición encontrada
        elementos[i + 1] = x;
        prioridades[i + 1] = prioridad;
        elementos[0]++;
    }

    @Override
    public void Desacolar() {  // no borra por prioridad creo corregir este
        if (!ColaVacia()) {
            for (int i = 1; i < elementos[0]; i++) {
                elementos[i] = elementos[i + 1];
                prioridades[i] = prioridades[i + 1];
            }
            elementos[0]--;
        }
    }

    @Override
    public boolean ColaVacia() {
        return elementos[0] == 0;

    }

    @Override
    public int Primero() {
        return elementos[1];
    }

    @Override
    public int Prioridad() {
        return prioridades[1];
    }
}

