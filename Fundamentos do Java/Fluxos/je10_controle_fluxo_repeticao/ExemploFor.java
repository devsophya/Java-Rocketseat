package je10_controle_fluxo_repeticao;

public class ExemploFor {
    public static void main(String[] args) {
    String alunos[] = {"Gustavo", "Marcello", "Tania", "Angela"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}

/*
        -um exemplo da aplicação for-
        int carneirinhos = 0;
        for(;carneirinhos <=20;){
            System.out.println(carneirinhos +  " - Carneirinho(s)");
            carneirinhos = carneirinhos +2 ;
        }
 */