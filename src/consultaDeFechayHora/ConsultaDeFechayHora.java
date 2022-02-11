package consultaDeFechayHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConsultaDeFechayHora {

    public static void main(String[] args) {
        DateTimeFormatter fecha_hora = DateTimeFormatter.ofPattern("(YYYY/MM/dd) (HH:mm:ss)");

        System.out.println("La fecha y hora actual es: "+fecha_hora.format(LocalDateTime.now()));


    }
}
