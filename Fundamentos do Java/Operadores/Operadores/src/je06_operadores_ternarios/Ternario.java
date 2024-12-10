package je06_operadores_ternarios;

public class Ternario {
    public static void main(String[] args) {
        String nome = "Gu";
        int idade = 15;
        final int MAIOR_IDADE = 18;
        //boolean maiorIdade = idade >= MAIOR_IDADE;
        //String mensagem = nome + (maiorIdade ? " é de maior" : " não é de maior");
        //System.out.println(mensagem);

        if(idade >= MAIOR_IDADE)
            System.out.println(nome + " é de maior");
        else
            System.out.println(nome + " NÃO é de maior");
    }
}
