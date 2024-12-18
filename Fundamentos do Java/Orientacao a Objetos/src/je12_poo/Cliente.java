package je12_poo;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;

    public void solicitarLimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado;
    }
    public void comprar(Double valorProduto){
        limiteCredito = limiteCredito - valorProduto;
    }
    public Cliente (String nome){
        this.nome = nome;
    }
}


