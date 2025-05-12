package interfaces;

public interface DiccionarioMultipleTDA {
    void agregar(Integer clave, Double[] valor);
    void eliminar(Integer clave);
    void eliminar_valor(Integer clave, Double valor);
    Double[] recuperar(Integer clave);
    Integer[] obtener_claves();
    void inicializar_diccionario();
}
