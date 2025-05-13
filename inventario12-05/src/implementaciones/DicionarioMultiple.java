package implementaciones;

import interfaces.DiccionarioMultipleTDA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;


public class DicionarioMultiple implements DiccionarioMultipleTDA {
    HashMap<Integer, List<String>> datos;

    @Override
    public void agregar(Integer clave, String valor) {
        // Corroboramos que al agregar, si la clave no existe, se cree su espacio
        // Si ya existe, agregamos el valor correspondiente
        if(!datos.containsKey(clave)){
            datos.put(clave, new ArrayList<>());
        }
        datos.get(clave).add(valor);
    }

    @Override
    public void eliminar(Integer clave) {
        datos.remove(clave);
    }

    @Override
    public void eliminar_valor(Integer clave, String valor) {

        //traer el valor actual por clave
        // acceder al valor
        // borrar solo el valor, no la clave entera

        List<String> lista = datos.get(clave);
            if(lista != null){
                lista.remove(valor);}
    }

    @Override
    public List<String> recuperar(Integer clave) {
        return datos.get(clave);
    }

    //public String recuperarSout(Integer clave) {
    //    return Arrays.toString(datos.get(clave));
    //}

    @Override
    public Integer[] obtener_claves() {
        return datos.keySet().toArray(new Integer[0]);
    }

    public String obtener_clavesToString() {
        return Arrays.toString(datos.keySet().toArray(new Integer[0]));
    }

    @Override
    public void inicializar_diccionario() {
        datos = new HashMap<>();
    }
}
