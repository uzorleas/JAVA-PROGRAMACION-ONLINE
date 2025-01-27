package model;

public class Curso {
    private int cod_curso;
    private String nombre;
    private boolean curso_vigente;
    private int años_experiencia;

    // Constructor con código de curso, nombre y años de experiencia
    public Curso(int cod_curso, String nombre, int años_experiencia) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.curso_vigente = true; // Valor inicial por defecto
        this.años_experiencia = años_experiencia;
    }

    // Getters y setters opcionales
    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCurso_vigente() {
        return curso_vigente;
    }

    public void setCurso_vigente(boolean curso_vigente) {
        this.curso_vigente = curso_vigente;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    @Override
    public String toString() {
        return "Curso{" +
               "cod_curso=" + cod_curso +
               ", nombre='" + nombre + '\'' +
               ", curso_vigente=" + curso_vigente +
               ", annos_experiencia=" + años_experiencia +
               '}';
    }
}

