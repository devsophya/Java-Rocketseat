package je09_controle_atribuicaoternaria;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado!" : nota >=5 && nota<7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
    static void fluxoIntermediario(){
        System.out.println("Recuperação");
        System.out.println("Estude um pouco mais!");
    }
}

