package je10_controle_fluxo_repeticao;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Anya gastou toda sua mesada em doces");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(6,15);
    }
}

/*
        -exemplo while na contagem de carneirinhos-

        boolean acordado = true;
        int carneirinhos = 0;
        while(acordado ) {
            System.out.println("contando carneirinhos... " + (++carneirinhos));
            acordado = !(new Random().nextInt(3) == carneirinhos);
            if (carneirinhos==20)
                carneirinhos = 0;
        }
        System.out.println("Dormiu... ");
 */