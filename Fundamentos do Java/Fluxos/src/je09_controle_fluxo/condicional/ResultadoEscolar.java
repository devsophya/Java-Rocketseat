package je09_controle_fluxo.condicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado!");
        else if (nota >= 5 && nota < 7)
            fluxoIntermediario();
        else
            System.out.println("Reprovado :( ");
    }
    static void fluxoIntermediario(){
        System.out.println("Recuperação");
        System.out.println("Estude um pouco mais!");
    }
}
