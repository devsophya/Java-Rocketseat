package je15_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2024,1,10);

        String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataFormatada);


    }
}

/*
        String stringDataBr = "10/01/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConcreta = LocalDate.parse(stringDataBr,formatter);
        System.out.println(dataConcreta);


        LocalDate aniversarioIzabelly = LocalDate.of(2023,4,5);
        //LocalDate dataQueTera15Anos = aniversarioIzabelly.plusYears(15);
        LocalDate novaData = aniversarioIzabelly.minusDays(7);
        System.out.println(novaData);


        LocalDate data = LocalDate.of(2024,7,9);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(data);
        //formatando a data criada acima
        System.out.println(formatter.format(data));


 */