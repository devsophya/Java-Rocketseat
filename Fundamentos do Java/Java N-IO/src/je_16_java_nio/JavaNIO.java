package je_16_java_nio;

import javax.sound.midi.Soundbank;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {

            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");
            List<String> nomes = new ArrayList<>();
            nomes.add("SOPHYA");
            nomes.add("GUSTAVO");

            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(n->conteudo.append(n + "\n"));
            Files.write(path,conteudo.toString().getBytes(StandardCharsets.UTF_8));


        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

/*
           Escrevendo os valores dentro do meu documento

            List<String> linhas = Files.readAllLines(path);
            linhas.forEach(l-> System.out.println(l));
 */