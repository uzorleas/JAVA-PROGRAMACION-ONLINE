package model;

/**
 *
 * @author Libia
 */
public class GenericoEjemplo <T> {   // t es que sera reemplazado como tipo de datos
    private T dato;
    
    public GenericoEjemplo(T dato) {
        this.dato = dato;
    }
    
    public T getDato() {
        return dato;
    }
}
