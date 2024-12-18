package je12_poo_enums.comparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("prata","hyundai","hb20");
        Carro carro2 = new Carro("prata","hyundai","i30");
        Carro carro3 = new Carro("prata","hyundai","hb20");
        Carro carro4 = new Carro("prata","hyundai","hb20");
        Carro carro5 = new Carro("prata","hyundai","hb20");

        Carro carro6 = carro1;

        //case 01
        System.out.println(carro1 == carro2);
        //case02
        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));
    }
}
