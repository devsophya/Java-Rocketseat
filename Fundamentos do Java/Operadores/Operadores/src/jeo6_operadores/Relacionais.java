package jeo6_operadores;

public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2= 2;

        int idadeGu = 21;
        boolean maiorIdade = idadeGu >= 18;
        //System.out.println("Gu é maior de idade ? " + maiorIdade);
        System.out.println("Gu é maior de idade ? " + (maiorIdade ? "Sim" : "Não"));

        if(numero1 > numero2)
            System.out.println("Numero 1 é maior que o numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 é menor que o numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 é maior ou igual o numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 é menor ou igual o numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente do numero 2");
    }
}
