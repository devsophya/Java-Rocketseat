package je_19_arrays;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        Set linguagens = new LinkedHashSet();
        linguagens.add("java");
        linguagens.add("c#");
        linguagens.add("java script");
        linguagens.add("go");
        linguagens.add("java");
        linguagens.remove("go");
        linguagens.add("python");

        System.out.println(linguagens.contains("python"));

        for(Object linguagem: linguagens){
            System.out.println(linguagem);
        }
    }
}
/*
        System.out.println("A linguagem na posição 3 é " + linguagens.get(3));
        System.out.println("A linguagem C# está na posição " + linguagens.indexOf("c#"));
        System.out.println("Comprimento atual: " + linguagens.size());


        Set linguagens = new TreeSet<>(); - deixaria a lista organizada alfabeticamente
 */