public class Estrategia_cola {
    int [] cola;
    int indice;

    public Estrategia_cola() {
    }


    public void inicializar_cola(){
        cola=new int[100];
        indice=0;
    }
    public  int primer_elemento(){
        return cola[indice-1];

    }

    public boolean Cola_vacia(){
        return (indice!=0);
    }

    public void acolar(int x){
       for (int i=indice-1;i>=0;i--){
           cola[i+1]=cola[i]; // muevo los elementos a la derecha
       }
        cola[0]=x;// cola el numero valor en la posicion 0
        indice++;
    }

    public void desacolar(){
     if (!Cola_vacia()){
         indice--;
     }
    }



}

