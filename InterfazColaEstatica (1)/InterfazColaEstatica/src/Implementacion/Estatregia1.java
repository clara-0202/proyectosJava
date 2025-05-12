package Implementacion;
import Interfaz.ColaTDA;
public class Estatregia1 implements ColaTDA {
    int[] cola;
    int indice;
    @Override
    public void IncializarCola() {
        cola = new int[100]; //este 100 es aleatorio
                             //es grande para que no se llene
        indice = 0;
    }

    @Override
    public void Acolar(int x) {
        for (int i=indice-1; i >=0; i--){
            cola[i+1] = cola[i];
        }
        cola[0]=x;
        indice++;
    }

    @Override
    public void Desacolar() {
        indice--;
    }

    @Override
    public boolean ColaVacia() {
        return (indice == 0);
    }

    @Override
    public int Primero() {
        return cola[indice-1];
    }
}
