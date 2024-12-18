package je12_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente sophya = new Cliente("Sophya Damiazo");
        System.out.println(sophya.limiteCredito);
        sophya.solicitarLimiteCredito(200.0);
        System.out.println(sophya.limiteCredito);

        sophya.comprar(50.0);


        Cliente gustavo = new Cliente("Gustavo Vieira");
        System.out.println(gustavo.limiteCredito);
        gustavo.solicitarLimiteCredito(80.0);
        gustavo.comprar(22.0);

        System.out.println("Limite do(a) " + gustavo.nome + " é " + gustavo.limiteCredito);
        System.out.println("Limite do(a) " + sophya.nome + " é " + sophya.limiteCredito);

    }
}
