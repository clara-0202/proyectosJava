package interfaces;
import java.util.List;

public interface DiccionarioMultipleTDA {
    void agregar(Integer clave, String valor);
    void eliminar(Integer clave);
    void eliminar_valor(Integer clave, String valor);
    List<String> recuperar(Integer clave);
    Integer[] obtener_claves();
    void inicializar_diccionario();
}
