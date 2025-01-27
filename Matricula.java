package model;

public class Matricula {
    private CursoAperturado cursoMatriculado;
    private Alumno alumno;
    private boolean pagado;
    private Fecha fecha_pago;

    // Constructor con curso matriculado, alumno y estado de pago
    public Matricula(CursoAperturado cursoMatriculado, Alumno alumno, boolean pagado) {
        this.cursoMatriculado = cursoMatriculado;
        this.alumno = alumno;
        this.pagado = pagado;
        this.fecha_pago = pagado ? new Fecha() : null; // Fecha actual si está pagado
    }

    // Getters y setters opcionales
    public CursoAperturado getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(CursoAperturado cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
        this.fecha_pago = pagado ? new Fecha() : null; // Actualiza la fecha de pago si es necesario
    }

    public Fecha getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Fecha fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    @Override
    public String toString() {
        return "Matricula{" +
               "cursoMatriculado=" + (cursoMatriculado != null ? cursoMatriculado.getCurso().getNombre() : "No definido") +
               ", alumno=" + (alumno != null ? alumno.getNombres() : "No definido") +
               ", pagado=" + pagado +
               ", fecha_pago=" + (fecha_pago != null ? fecha_pago.toString() : "No definido") +
               '}';
    }
}
