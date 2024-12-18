package je12_poo_enums.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        //stack vs heap

        String string = "sophya";
        String string1 = new String("Sophya");
        //Integer i1 = 128;
        //Integer i2 = Integer.parseInt("128");

        System.out.println(string1.equalsIgnoreCase(string));
    }
}
