public class Estrateguia_pila {


        int[] pila;
        int indice;

    public Estrateguia_pila() {
    }

    public void IncializarPila() {
            pila=new int[100]; //este 100 es aleatorio
            //es grande para que no se llene
            indice = 0;
        }


        public void Apilar(int x) {
            pila[indice]=x;
            indice++;
        }


        public void Desapilar() {
            if (PilaVacia()) {
                indice--;

            }
        }


        public boolean PilaVacia() {
            return (indice != 0);
        }


        public int Tope() {
            if (this.PilaVacia()) {
                return pila[indice - 1];
            }
            return 0;
        }

}
