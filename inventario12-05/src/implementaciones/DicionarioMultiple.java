package implementaciones;

import interfaces.DiccionarioMultipleTDA;

import java.util.HashMap;

public class DicionarioMultiple implements DiccionarioMultipleTDA {
    HashMap<Integer, Double[]> datos;

    @Override
    public void agregar(Integer clave, Double[] valor) {
        datos.put(clave, valor);
    }

    @Override
    public void eliminar(Integer clave) {
        datos.remove(clave);
    }

    @Override
    public void eliminar_valor(Integer clave, Double valor) {
        datos.remove(clave, valor);
    }

    @Override
    public Double[] recuperar(Integer clave) {
        return datos.get(clave);
    }

    @Override
    public Integer[] obtener_claves() {
        return datos.keySet().toArray(new Integer[0]);
    }

    @Override
    public void inicializar_diccionario() {

    }
}
