package je06_operadores_ternarios;

public class Logicos {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 1;

        if(numero1 == 2 || numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O número 1 agora é " + numero1);
        System.out.println("O número 2 agora é " + numero2);
    }
}

/*
        boolean condicao1 =false;
        boolean condicao2 =true;

        if( (1==1 && 2 < 3) || 4 < 5 )
        System.out.println("Lógica complexa porém verdadeira");;

        if(condicao1 && condicao2)
        System.out.println("Os dois valores precisam ser verdadeiros");;

        if(condicao1 || condicao2)
        System.out.println("Um dos valores precisa ser verdadeiro");

 */