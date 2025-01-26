package controller;
import model.Alumno;

/**
 *
 * @author Libia
 */
public class Alumnos {
    public static void main(String[] args) {
        Alumno alumnos[];
        
        alumnos = new Alumno[2];
        
        alumnos[0] = new Alumno(456, "Ana Abad", 2024);
        alumnos[1] = new Alumno(888, "Abel Abad", 2020);
        
        
        // Esta es una forma de recorrer losobjetos de una colecxcion
        // Se declara una variable del tipo de la clase quew es el elemento
        // del arreglo:
        // for(Clase del elmento var : arreglo_coleccion_a_recorrer) {}
        for(Alumno a:alumnos){
            System.out.println("Codigo              :" + a.getCod_alum());
            System.out.println("Codigo              :" + a.getNombres());
            System.out.println("Codigo              :" + a.getAño_ingreso());
        }
    }
    
}
