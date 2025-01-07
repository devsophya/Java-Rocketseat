package je_17_excecoes;

public class EstadoValidateException extends Exception {
    public EstadoValidateException(){
        super("O estado não foi localizado");
    }

}
