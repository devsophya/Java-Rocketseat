package je14_pilares_poo;

public class ComputadorGustavo {
    public static void main(String[] args) {
        SistemaMensagemInstantanea smi = null;
        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
