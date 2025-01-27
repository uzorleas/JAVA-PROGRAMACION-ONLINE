package model;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Docente extends Persona {
    private Fecha fec_registro;
    private Fecha fec_titulacion;
    private boolean docente_vigente;
    private String telefono;

    // Constructor con Persona y teléfono (se asume fecha de registro actual)
    public Docente(Persona persona, String telefono) {
        super(persona.getDNI(), persona.getNombres(), persona.getFec_nac(), persona.getEmail());
        this.fec_registro = new Fecha(); // Fecha actual
        this.fec_titulacion = null; // Sin fecha de titulación inicial
        this.docente_vigente = true; // Valor inicial por defecto
        this.telefono = telefono;
    }

    // Constructor con Persona (se asume fecha de registro actual y sin teléfono)
    public Docente(Persona persona) {
        super(persona.getDNI(), persona.getNombres(), persona.getFec_nac(), persona.getEmail());
        this.fec_registro = new Fecha(); // Fecha actual
        this.fec_titulacion = null; // Sin fecha de titulación inicial
        this.docente_vigente = true; // Valor inicial por defecto
        this.telefono = "No especificado";
    }

    // Método para calcular la antigüedad del docente en años desde la fecha de registro
    public int getAntiguedad() {
        LocalDateTime fechaRegistro = LocalDateTime.of(fec_registro.getAño_int(), fec_registro.getMes_int(), fec_registro.getDia_int(), 0, 0);
        LocalDateTime fechaActual = LocalDateTime.now();

        return (int) ChronoUnit.YEARS.between(fechaRegistro, fechaActual);
    }

    // Método para calcular los años de experiencia desde la fecha de titulación
    public int getTiempoExperiencia() {
        if (fec_titulacion == null) {
            throw new IllegalStateException("La fecha de titulación no está definida.");
        }

        LocalDateTime fechaTitulacion = LocalDateTime.of(fec_titulacion.getAño_int(), fec_titulacion.getMes_int(), fec_titulacion.getDia_int(), 0, 0);
        LocalDateTime fechaActual = LocalDateTime.now();

        return (int) ChronoUnit.YEARS.between(fechaTitulacion, fechaActual);
    }

    @Override
    public String toString() {
        return "Docente{" +
               "DNI='" + getDNI() + '\'' +
               ", nombres='" + getNombres() + '\'' +
               ", fec_nac=" + (getFec_nac() != null ? getFec_nac().toString() : "No definida") +
               ", email='" + (getEmail() != null ? getEmail() : "No definido") + '\'' +
               ", fec_registro=" + (fec_registro != null ? fec_registro.toString() : "No definida") +
               ", fec_titulacion=" + (fec_titulacion != null ? fec_titulacion.toString() : "No definida") +
               ", docente_vigente=" + docente_vigente +
               ", telefono='" + telefono + '\'' +
               '}';
    }

    // Getters y setters opcionales
    public Fecha getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public Fecha getFec_titulacion() {
        return fec_titulacion;
    }

    public void setFec_titulacion(Fecha fec_titulacion) {
        this.fec_titulacion = fec_titulacion;
    }

    public boolean isDocente_vigente() {
        return docente_vigente;
    }

    public void setDocente_vigente(boolean docente_vigente) {
        this.docente_vigente = docente_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
