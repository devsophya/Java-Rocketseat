package je_19_arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List <String> prateleira = new ArrayList();
        prateleira.add("hb20");
        prateleira.add("golf tsi");
        prateleira.add("relampago marquinhos");
        prateleira.add("siena");

        Collections.sort(prateleira);
        Collections.reverse(prateleira);
        Collections.shuffle(prateleira);

        for (String carrinho: prateleira){
            System.out.println(carrinho);
        }

    }
}
