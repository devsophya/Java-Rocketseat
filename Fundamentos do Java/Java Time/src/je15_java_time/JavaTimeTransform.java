package je15_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.of(2025, 1, 3, 8, 25);
        //esperaData(dataHora.toLocalDate());
        esperaData(dataHora.toLocalTime());
    }
    static void esperaData(LocalTime hora){

    }

}

