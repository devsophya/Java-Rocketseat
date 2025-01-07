package je_17_excecoes;

public class Excecoes {
    public static void main(String[] args) {
        try{
            checkEstado("fa");
        }catch (EstadoValidateException e){
            System.out.println(e.getMessage());
            System.out.println("Selecione um estado válido");
        }

    }
    static void checkEstado(String nomeEstado) throws EstadoValidateException{
        if(!nomeEstado.equalsIgnoreCase("SP"))
            throw new EstadoValidateException();
        System.out.println("Bem-vindo ao (a) " + nomeEstado.toUpperCase());
    }
}







/*  tratamento de exceções
    public static void main(String[] args) {
        try {
            Double valor = (double) (100 / 0);
            System.out.println(valor);
        }catch (Exception ex) {
            System.out.println("erro");
            ex.printStackTrace();

        }finally {
            System.out.println("Finally bloco");
        }
    }
 */