package controller;
import model.GenericoEjemplo;
import model.Alumno;
/**
 *
 * @author Libia
 */
public class TestGenerico {
    public static void main(String[] args) {
        GenericoEjemplo<Integer> g1 = new GenericoEjemplo<>(10);
        System.out.println("g1 + 5 es " + (g1.getDato() + 5));
        
        GenericoEjemplo<Alumno> g2 = new GenericoEjemplo<>(new Alumno(777, "ANA MARIA", 2025));
        System.out.println("El alumno es: " + (g2.getDato()));
    }
}
