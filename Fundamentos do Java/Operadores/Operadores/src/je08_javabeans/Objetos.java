package je08_javabeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno gustavo = new Aluno();
        gustavo.setNome("Gustavo Vieira");
        gustavo.setIdade(21);
        System.out.println(gustavo.getNome());
        System.out.println(gustavo.getIdade());
    }
}
