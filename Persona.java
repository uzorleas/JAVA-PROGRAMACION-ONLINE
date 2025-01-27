package model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String DNI;
    private String nombres;
    private Fecha fec_nac;
    private String email;

    // Constructor con DNI y nombres
    public Persona(String DNI, String nombres) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.fec_nac = null;
        this.email = null;
    }

    // Constructor con DNI, nombres, fecha de nacimiento y email
    public Persona(String DNI, String nombres, Fecha fec_nac, String email) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.fec_nac = fec_nac;
        this.email = email;
    }

    // Método para calcular la edad de la persona
    public int getEdad() {
        if (this.fec_nac == null) {
            throw new IllegalStateException("La fecha de nacimiento no está definida.");
        }

        LocalDateTime fechaNacimiento = LocalDateTime.of(fec_nac.getAño_int(), fec_nac.getMes_int(), fec_nac.getDia_int(), 0, 0);
        LocalDateTime fechaActual = LocalDateTime.now();

        return (int) ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
    }

    @Override
    public String toString() {
        return "Persona{" +
               "DNI='" + DNI + '\'' +
               ", nombres='" + nombres + '\'' +
               ", fec_nac=" + (fec_nac != null ? fec_nac.toString() : "No definida") +
               ", email='" + (email != null ? email : "No definido") + '\'' +
               '}';
    }

    // Getters y setters opcionales
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Fecha getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Fecha fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

