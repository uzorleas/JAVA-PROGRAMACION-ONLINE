package controller;
import java.util.ArrayList;
import model.Alumno;
/**
 *
 * @author Libia
 */
public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList lista;   // declarar un arreglo lista
        lista = new ArrayList();  // dar el espacio inicial de memoria
        
        lista.add("Mensaje 1");   // Se ingresa Strings
        lista.add("Mensaje 2");
        lista.add("Mensaje 3");
        lista.add("Mensaje 4");
        lista.add("Saludos");
        // SE INGRESA OTRO TIPO DE DATO
        lista.add(new Alumno(5555, "ABEL ABAD", 2022));
        
        lista.remove(new Alumno(555, "ABEL ABAD", 2022));
        System.out.println("La lista con un elemento eliminado tiene " + lista.size() + "elementos");
        // Muestra de lo guardado
        for(Object e : lista) {    // la lista almacena OBJETOS
            if(e instanceof Alumno) {
                System.out.println(((Alumno)e));
            } else {
                // de otra forma mostrar las cadenas
                System.out.println(((String)e));  //  El OBJETO se transforma a String
            }
       }
        System.out.println("El indice 2 contiene " + lista.get(2));
        
    }
}
