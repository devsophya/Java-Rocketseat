package estrutura_exercicio;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    boolean ativo = true;

    Double consultarSaldo(){

        return saldo;
    }

    List consultarExtrato(LocalDate dataInicial,
                          LocalDate dataFinal) {
        return ??
    };

    void cancelar(String justificativa) {
        //justificativa irá manipular o atributo
        //ativo para que se torne false

    }

    void transferir (ContaCorrente contaDestino,
                     Double valorTransferido) {
    }

    void sacar (Double valorSolicitado) {
        //não solicitei lógica
    }
}
