package je11_controle_fluxo_excecao;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            DecimalFormat df = new DecimalFormat();
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator(',');
            symbols.setGroupingSeparator('.');
            df.setDecimalFormatSymbols(symbols);
            Number num = df.parse("1,75");

            System.out.println(num.doubleValue());
        }catch (ParseException e) {
            System.err.println("Número Inválido");
        }
    }
}
