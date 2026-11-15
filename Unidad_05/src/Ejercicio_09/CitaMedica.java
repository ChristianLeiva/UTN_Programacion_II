package Ejercicio_09;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Christian Leiva
 */
public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(Paciente _paciente, Profesional _profesional) {
        this.fecha = generarFechaFuturaAleatoria(30);
        this.hora = generarHoraComercialAleatoria();
        this.paciente = _paciente;
        this.profesional = _profesional;
    }    
    
    // Genera una fecha entre hoy y hasta X días en el futuro (ej. 30 días)
    public static LocalDate generarFechaFuturaAleatoria(int diasMaximosEnFuturo) {
        LocalDate hoy = LocalDate.now();
        long diasAAgregar = ThreadLocalRandom.current().nextLong(0, diasMaximosEnFuturo + 1);
        return hoy.plusDays(diasAAgregar);
    }

    // Genera una hora aleatoria entre las 08:00 y las 20:00
    public static LocalTime generarHoraComercialAleatoria() {
        int hora = ThreadLocalRandom.current().nextInt(8, 20); // Entre 8 (inclusive) y 20 (exclusive, ej. max 19:59)
        int minuto = ThreadLocalRandom.current().nextInt(0, 60);
        return LocalTime.of(hora, minuto);
    }

    @Override
    public String toString() {
        return "Informacion de la Cita Medica:\n\tFecha: " + fecha + ", hora: " + hora + profesional + paciente  ;        
    }   
}
    
    

