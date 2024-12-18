package je13_classes_essenciais;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = litrosUtilizados.multiply(precoLitro);
        System.out.println(valorPagar);

        //arredondando...
        BigDecimal valorPagarArredondado = valorPagar.setScale(2,RoundingMode.HALF_EVEN);
        System.out.println(valorPagarArredondado);
    }
}



/*
        System.out.println("Sophya");
        System.out.println("Damiazo");


        try {
            System.out.println("Dividindo 1/0");
            System.out.println(1/0);
        }catch (Exception ex){
            System.err.println("Houve um erro na tentativa de divisão");
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua idade: ");
        Integer idade = scan.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);

                String nome = null;
        Integer idade = null;
        Double peso = null;

        String stringLinhaArquivo = "sophya damiazo;19;70.65";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter(";");

        int index = 0;
        while (scan.hasNext()){
            if (index == 0)
                nome = scan.next();
            else if (index == 1)
                idade = Integer.valueOf(scan.next());
            else
                peso = Double.valueOf(scan.next());

            index ++;
        }

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);


        String nome = "sophya";
        int idade = 19;
        doubl peso = 70.65;
        double renda = 3234.56;

        System.out.printf("Nome: %s Idade: %d Peso: %.2f Renda: R$ %,.2f", nome, idade, peso, renda);


        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal resultado = zero.add(new BigDecimal("100"));

        resultado = resultado.subtract(new BigDecimal("27.5"));

        System.out.println(resultado);


        -- operações e escalas com big decimal--

        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado = BigDecimal.TEN.divide(divisor,2, RoundingMode.HALF_EVEN);
        System.out.println(resultado);
 */