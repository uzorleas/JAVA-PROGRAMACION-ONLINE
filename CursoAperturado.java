package model;

public class CursoAperturado {
    private int cod_curso_aperturado;
    private Docente docente;
    private Curso curso;
    private Fecha fecha_inicio;
    private int costo;

    // Constructor con código de curso, docente, curso y fecha de inicio
    public CursoAperturado(int cod_curso_aperturado, Docente docente, Curso curso, Fecha fecha_inicio) {
        this.cod_curso_aperturado = cod_curso_aperturado;
        this.docente = docente;
        this.curso = curso;
        this.fecha_inicio = fecha_inicio;
        this.costo = calcularCosto();
    }

    // Constructor con código de curso, docente y curso (se asume fecha de inicio actual)
    public CursoAperturado(int cod_curso_aperturado, Docente docente, Curso curso) {
        this.cod_curso_aperturado = cod_curso_aperturado;
        this.docente = docente;
        this.curso = curso;
        this.fecha_inicio = new Fecha(); // Fecha actual
        this.costo = calcularCosto();
    }

    // Método para calcular el costo del curso (puede ajustarse según reglas específicas)
    private int calcularCosto() {
        return curso.getAños_experiencia() * 100; // Ejemplo: costo basado en experiencia
    }

    @Override
    public String toString() {
        return "CursoAperturado{" +
               "cod_curso_aperturado=" + cod_curso_aperturado +
               ", docente=" + (docente != null ? docente.getNombres() : "No definido") +
               ", curso=" + (curso != null ? curso.getNombre() : "No definido") +
               ", fecha_inicio=" + (fecha_inicio != null ? fecha_inicio.toString() : "No definida") +
               ", costo=" + costo +
               '}';
    }

    // Getters y setters opcionales
    public int getCod_curso_aperturado() {
        return cod_curso_aperturado;
    }

    public void setCod_curso_aperturado(int cod_curso_aperturado) {
        this.cod_curso_aperturado = cod_curso_aperturado;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Fecha getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Fecha fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
