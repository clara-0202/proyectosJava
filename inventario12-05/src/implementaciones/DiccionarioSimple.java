package implementaciones;

import interfaces.DiccionarioSimpleTDA;

import java.util.Arrays;
import java.util.HashMap;

public class DiccionarioSimple implements DiccionarioSimpleTDA {
    HashMap<Integer,Double > datos;

    @Override
    public void agregar(Integer clave, double valor) {
        datos.put(clave, valor);
    }

    @Override
    public void eliminar(Integer clave) {
        datos.remove(clave);
    }

    @Override
    public double recuperar(Integer clave) {
        return datos.get(clave);
    }

    @Override
    public Integer[] obtener_clave() {
        return datos.keySet().toArray(new Integer[0]);
    }

    public String obtener_claveToString() {
        return Arrays.toString(datos.keySet().toArray(new Integer[0]));
    }

    @Override
    public void inicializar_diccionario() {
        datos = new HashMap<>();
    }
}
