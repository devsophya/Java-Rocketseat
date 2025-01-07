package je_18_expressoes;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Sophya";
        Integer matricula = 123;
        Double salario = 2245.83;


        String dadosFuncionario = String.format("Mat.: %d - Nome: %s - Sal.: R$ %,.2f ",matricula,nome,salario);
        System.out.println(dadosFuncionario);
    }
}


// "Ola ".concat(nome).concat(" ").concat(sobrenome);  impressao da forma convencional sem ter as expressoes