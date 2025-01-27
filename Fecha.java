package model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Fecha {

    private int dia_int;
    private int mes_int;
    private int año_int;
    private int hora;
    private int min;
    private int seg;

    // Constructor que genera la fecha y hora actual
    public Fecha() {
        LocalDateTime ahora = LocalDateTime.now();
        this.dia_int = ahora.getDayOfMonth();
        this.mes_int = ahora.getMonthValue();
        this.año_int = ahora.getYear();
        this.hora = ahora.getHour();
        this.min = ahora.getMinute();
        this.seg = ahora.getSecond();
    }

    // Constructor con día, mes y año
    public Fecha(int dia_int, int mes_int, int año_int) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    // Constructor con día, mes, año, hora, minutos y segundos
    public Fecha(int dia_int, int mes_int, int año_int, int hora, int min, int seg) {
        this.dia_int = dia_int;
        this.mes_int = mes_int;
        this.año_int = año_int;
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    // Método para calcular la diferencia en días entre dos fechas
    public static long diferenciaFecha(Fecha fecha1, Fecha fecha2) {
        LocalDateTime dateTime1 = LocalDateTime.of(fecha1.año_int, fecha1.mes_int, fecha1.dia_int, fecha1.hora, fecha1.min, fecha1.seg);
        LocalDateTime dateTime2 = LocalDateTime.of(fecha2.año_int, fecha2.mes_int, fecha2.dia_int, fecha2.hora, fecha2.min, fecha2.seg);
        return ChronoUnit.DAYS.between(dateTime1, dateTime2);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d %02d:%02d:%02d", dia_int, mes_int, año_int, hora, min, seg);
    }

    // Getters y setters opcionales
    public int getDia_int() {
        return dia_int;
    }

    public void setDia_int(int dia_int) {
        this.dia_int = dia_int;
    }

    public int getMes_int() {
        return mes_int;
    }

    public void setMes_int(int mes_int) {
        this.mes_int = mes_int;
    }

    public int getAño_int() {
        return año_int;
    }

    public void setAño_int(int año_int) {
        this.año_int = año_int;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
}
