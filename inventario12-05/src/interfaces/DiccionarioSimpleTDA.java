package interfaces;

public interface DiccionarioSimpleTDA {
    void agregar(Integer clave, double valor);
    void eliminar(Integer clave);
    double recuperar(Integer clave);
    Integer[] obtener_clave();
    void inicializar_diccionario();

}
