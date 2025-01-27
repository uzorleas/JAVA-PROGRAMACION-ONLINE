package controller;
import model.Fecha;
import model.Persona;
import model.Alumno;
import model.Docente;
import model.Curso;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExamenFinal {

    // Método para verificar si un alumno puede matricularse
    public static boolean puedeMatricularse(Alumno alumno) {
        // Fecha de referencia: 26/01/2025
        LocalDateTime fechaReferencia = LocalDateTime.of(2025, 1, 26, 0, 0);
        
        if (alumno.getFec_nac() == null) {
            throw new IllegalStateException("La fecha de nacimiento del alumno no está definida.");
        }

        LocalDateTime fechaNacimiento = LocalDateTime.of(
            alumno.getFec_nac().getAño_int(), 
            alumno.getFec_nac().getMes_int(), 
            alumno.getFec_nac().getDia_int(), 
            0, 0
        );

        long edad = ChronoUnit.YEARS.between(fechaNacimiento, fechaReferencia);
        return edad >= 18; // Retorna true si el alumno tiene 18 años o más
    }

    // Método para verificar si un docente puede aperturar un curso
    public static boolean puedeAperturarCurso(Docente docente, Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo.");
        }

        if (docente.getFec_titulacion() == null) {
            throw new IllegalStateException("La fecha de titulación del docente no está definida.");
        }

        int tiempoExperienciaDocente = docente.getTiempoExperiencia();
        return tiempoExperienciaDocente >= curso.getAños_experiencia(); // Verifica si cumple la experiencia mínima
    }

    // Método principal para probar las reglas de negocio
    public static void main(String[] args) {
        // Ejemplo de prueba para la regla de matriculación
        Fecha fechaNacimientoAlumno = new Fecha(1, 1, 2005); // 1 de enero de 2005
        Alumno alumno = new Alumno(new Persona("12345678", "Juan Perez", fechaNacimientoAlumno, "juan@example.com"));

        boolean puedeMatricular = puedeMatricularse(alumno);
        System.out.println("El alumno " + alumno.getNombres() + (puedeMatricular ? " puede" : " no puede") + " matricularse.");
        
        // Ejemplo de prueba para la regla de apertura de cursos
        Fecha fechaTitulacionDocente = new Fecha(1, 1, 2015); // 1 de enero de 2015
        Persona personaDocente = new Persona("87654321", "Maria Lopez", new Fecha(1, 1, 1990), "maria@example.com");
        Docente docente = new Docente(personaDocente);
        docente.setFec_titulacion(fechaTitulacionDocente);

        Curso curso = new Curso(101, "Matemáticas Avanzadas", 5); // Curso con 5 años de experiencia requerida

        boolean puedeAperturar = puedeAperturarCurso(docente, curso);
        System.out.println("El docente " + docente.getNombres() + (puedeAperturar ? " puede" : " no puede") + " aperturar el curso.");
    }
}
