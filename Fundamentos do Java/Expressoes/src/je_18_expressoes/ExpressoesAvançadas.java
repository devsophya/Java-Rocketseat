package je_18_expressoes;

import java.time.LocalDate;

public class ExpressoesAvançadas {
        public static void main(String[] args) {
            String nome = "Gustavo de Souza Vieira";
            Integer matricula = 23;
            Double salario = 2245.83;
            LocalDate dataAdmissao = LocalDate.now();
            System.out.println(dataAdmissao);

            String dadosFuncionario = String.format("Mat.: %05d Nome: %-15.15s Sal.: R$ %,.2f Data: %td/%<tm/%<tY",matricula,nome,salario,dataAdmissao);
            System.out.println(dadosFuncionario);
        }
    }

    /*
    y = dois ultimos numeros do ano
    Y = ano completo
    com %2$s %1$s posso definir as posicoes que quero que aparecam minhas strings
     */
