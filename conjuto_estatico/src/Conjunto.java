public class Conjunto {

    int [] elementos;
    int cant;

    public void inicializar_conjunto(){
        elementos= new int [100];
        cant=0;
    }
    //si yo quiero agregar tengo que saber si petenece, poruqe si ya esta en el
    //no lo puedo volver agregar
    public void agregar(int x){
        if (!pertenece(x)){
            if (cant < elementos.length){ // verifico que haya tamaño el array
                elementos[cant]=x;
                cant++;
            }
        }
    }
    // busca dentro de los primeros cant elementos si alguno es igual a x
    public void eliminar(int x){
        for (int i =0; i<cant;i++){
            if (elementos[i]==x){
                elementos[i]=elementos[cant-1];
                cant--;
            }
        }
    }

    public boolean conjunto_vacio(){
        return (cant==0);
    }

    public int elegir(){
        if (!conjunto_vacio()){
            return elementos[cant-1];
        }
        return -1;
    }
    public boolean pertenece(int x){
        for (int i = 0; i < cant; i++) {
            if (elementos[i]==x){
                return true;
            }
        }
        return false;
    }

}
