package je10_controle_fluxo_repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
                //break;
            System.out.println(numero);
        }
        //qual a saida no console?

    }
}
