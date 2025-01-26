package controller;

import model.Alumno;

/**
 *
 * @author Libia
 */
public class ArregloNumeros {
    public static void main(String[] args) {
        int n1[];       // declaracion de una varuable arreglo 
        // Antes de reservar memoria a una variable
        // la variable es NULA (null)
        n1 = new int[5];  // construccion del objeto n1
                          // reservacion de memoria (5 elementos de tipo int)
                          // conmemoria reservada, usar la variable.
        // los indices van desde 0 hasta n-1
        n1[0] = 10;
        n1[1] = 15;
        n1[2] = 18;
        n1[3] = 7;
        n1[4] = 11;
        
        // nmostrar
        for(int i = 0 ; i < n1.length; i++) {
            System.out.println("n1[" + i + "] es " + n1[i]);
            }

        Alumno alumnos[], alum1;
        
        alum1 = null;


        // En alguna parte se ha inicializado alum1
        alum1 = new Alumno(1234, "Ana Abad", 2022);
        
        
        if (alum1 == null) { 
            System.out.println("alum1 sin memoria o no hay datos ingresados");
        } else {
        System.out.println(alum1);}
    }
}
