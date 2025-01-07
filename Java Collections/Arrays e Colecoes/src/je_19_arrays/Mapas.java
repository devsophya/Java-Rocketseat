package je_19_arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        Map <String, String> estados = new TreeMap<>();
        estados.put("SP", "São Paulo");
        estados.put("AM", "Amazonas");
        estados.put("PR", "Paraná");
        estados.put("CE", "Ceará");
        System.out.println("O estado que está na chave SP é " + estados.get("SP"));

        Iterator <String> keys = estados.keySet().iterator();

        while (keys.hasNext()){
            String chave = keys.next();
            String valor = estados.get(chave);

            System.out.println("O estado é " + valor);
        }
    }
}
