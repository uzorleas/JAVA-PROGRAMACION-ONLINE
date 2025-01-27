package model;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona {
    private Fecha fec_registro;
    private boolean alumno_vigente;
    private String telefono;

    // Constructor con Persona, teléfono y fecha de registro
    public Alumno(Persona persona, String telefono, Fecha fec_registro) {
        super(persona.getDNI(), persona.getNombres(), persona.getFec_nac(), persona.getEmail());
        this.fec_registro = fec_registro;
        this.alumno_vigente = true; // Valor inicial por defecto
        this.telefono = telefono;
    }

    // Constructor con Persona (se asume fecha de registro actual y sin teléfono)
    public Alumno(Persona persona) {
        super(persona.getDNI(), persona.getNombres(), persona.getFec_nac(), persona.getEmail());
        this.fec_registro = new Fecha(); // Fecha actual
        this.alumno_vigente = true; // Valor inicial por defecto
        this.telefono = "No especificado";
    }

    // Método para calcular la antigüedad del alumno en años
    public int getAntiguedad() {
        LocalDateTime fechaRegistro = LocalDateTime.of(fec_registro.getAño_int(), fec_registro.getMes_int(), fec_registro.getDia_int(), 0, 0);
        LocalDateTime fechaActual = LocalDateTime.now();

        return (int) ChronoUnit.YEARS.between(fechaRegistro, fechaActual);
    }

    @Override
    public String toString() {
        return "Alumno{" +
               "DNI='" + getDNI() + '\'' +
               ", nombres='" + getNombres() + '\'' +
               ", fec_nac=" + (getFec_nac() != null ? getFec_nac().toString() : "No definida") +
               ", email='" + (getEmail() != null ? getEmail() : "No definido") + '\'' +
               ", fec_registro=" + (fec_registro != null ? fec_registro.toString() : "No definida") +
               ", alumno_vigente=" + alumno_vigente +
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

    public boolean isAlumno_vigente() {
        return alumno_vigente;
    }

    public void setAlumno_vigente(boolean alumno_vigente) {
        this.alumno_vigente = alumno_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
