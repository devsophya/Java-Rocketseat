package je09_controle_fluxo.condicional;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 17.0;
        double valorSolicitado = 17.0;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!!");

        }else {
            System.out.println("Saldo insuficiente");
        }
            System.out.println(saldo);

    }
}
