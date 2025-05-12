package implementacion;

import interfaz.Pila_TDA;

public class Estretegia_pila implements Pila_TDA {

    int[] pila;
    int indice;

    public Estretegia_pila() {

    }

    @Override
    public void IncializarPila() {
        pila=new int[100]; //este 100 es aleatorio
        //es grande para que no se llene
        indice = 0;
    }

    @Override
    public void Apilar(int x) {
        pila[indice]=x;
        indice++;
    }

    @Override
    public void Desapilar() {
       if (!PilaVacia()) {
           indice--;
       }
    }

    @Override
    public boolean PilaVacia() {
        return (indice == 0);
    }

    @Override
    public int Tope() {
        if (!this.PilaVacia()) {
            return pila[indice - 1];
        }
        return 0;
    }
}

