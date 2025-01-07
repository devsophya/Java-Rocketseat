package je_16_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SistemaCadastro {
    public static void main(String[] args) {

        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("Sophya Damiazo", "F", 19999999999L, LocalDate.of(2005, 01, 10), 35.0, false));
        cadastros.add(new Cadastro("Gustavo Vieira", "M", 32543774939L, LocalDate.of(2003, 02, 24), 40.0, true));
        cadastros.add(new Cadastro("Angela de Souza", "F", 45637228292L, LocalDate.of(1979, 10, 10), 40.0, false));
        cadastros.add(new Cadastro("Tony Stark", "M", 412910289373L, LocalDate.of(1985, 06, 15), 29.0, true));

        //escreverLayoutDelimitado(cadastros);
        lerLayoutDelimitado();
        //escreverLayoutPosicional(cadastros);
    }

    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT DELIMITADO - *****");

        try {
            StringBuilder conteudo = new StringBuilder();

            for (Cadastro cadastro : cadastros) {
                conteudo.append(cadastro.getNome() + ";");
                conteudo.append(cadastro.getSexo() + ";");
                conteudo.append(cadastro.getTelefone() + ";");
                conteudo.append(cadastro.getDataNascimento() + ";");
                conteudo.append(cadastro.getValorSugerido() + ";");
                conteudo.append(cadastro.isCliente());
                conteudo.append(System.lineSeparator());
            }
            System.out.println(conteudo.toString());

            Path arquivoDestino = Paths.get("c:\\rocket\\lista-contatos-modelo-delimitado.csv");

            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("EM BREVE ...");
    }

    public static List<Cadastro> lerLayoutDelimitado() {
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            Path arquivoOrigem = Paths.get("c:\\rocket\\lista-contatos-modelo-delimitado.csv");

            List<String> linhas = Files.readAllLines(arquivoOrigem);
            for (String linha : linhas) {
                String[] colunas = linha.split("\\;");
                String nome = colunas[0];
                String sexo = colunas[1];
                Long telefone = Long.valueOf(colunas[2]);
                LocalDate dataAniversario = LocalDate.parse(colunas[3]);
                Double valorSugerido = Double.valueOf(colunas[4]);
                boolean cliente = Boolean.valueOf(colunas[5]);

                cadastros.add(new Cadastro(nome, sexo, telefone, dataAniversario, valorSugerido, cliente));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cadastros;
    }

        public static void escreverLayoutPosicional(List<Cadastro> cadastros) {
            try {

                System.out.println("***** - LAYOUT POSICIONAL - *****");

                StringBuilder conteudo = new StringBuilder();
                for (Cadastro cadastro : cadastros) {
                    String nome = cadastro.getNome();

                    if (nome.length() > 30)
                        nome = nome.substring(0, 30);

                    if (nome.length() < 30)
                        nome = String.format("%-30s", nome);

                    conteudo.append(nome);
                    conteudo.append(cadastro.getSexo().toUpperCase());
                    conteudo.append(cadastro.getTelefone());
                    conteudo.append(cadastro.getDataNascimento());

                    DecimalFormat decimalFormat = new DecimalFormat("#0000.00");

                    String valorFormatado = decimalFormat.format(cadastro.getValorSugerido());
                    conteudo.append(valorFormatado.replaceAll("\\,", "\\."));
                    conteudo.append(cadastro.isCliente() ? "1" : "0");

                    conteudo.append(System.lineSeparator());
                }

                System.out.println(conteudo.toString());

                Path arquivoDestino = Paths.get("C:\\rocket\\lista-contatos-modelo-posicional.csv");

                Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
                
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
