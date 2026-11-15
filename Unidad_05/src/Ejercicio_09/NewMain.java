package Ejercicio_09;

/**
 *
 * @author Christian Leiva
 */
public class NewMain {

    public static void main(String[] args) {
        Paciente paciente_01 = new Paciente("Pepe Argento", "Swiss Medical");
        Profesional profesional_01 = new Profesional("Emiliano Paredes", "Cardiologia");
        
        //no le paso la fecha y hora porque tiene metedos que las generan aletariamente....
        CitaMedica cita_01 =  new CitaMedica(paciente_01, profesional_01);
        
        System.out.println(cita_01.toString());
    }

}
