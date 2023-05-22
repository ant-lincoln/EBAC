import java.util.*;

public class Nomes {

        public void separacaoSimplesTraco(){
            System.out.println("Digite uma lista de nomes separado por traço (-)");
            Scanner s = new Scanner(System.in);
            String nomes = s.next();
            String[] nomesDivididos = nomes.split("-");
            Set<String> nomesEmListas = new TreeSet<>();

            for (int i = 0; i<nomesDivididos.length; i++){
                String nome = nomesDivididos[i];
                nomesEmListas.add(nome);
            }

            System.out.println("Nomes em ordem alfabética: "+nomesEmListas);
        }


    public void separacaoGenero(){
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes e sexos separados por traço (-).");
        System.out.println("Exemplo: Antonio-M / Maria-F");
        System.out.println("Digite 'fim' para encerrar a entrada de nomes.");

        while (true) {
            System.out.print("Digite o nome e sexo: ");
            String input = s.nextLine();

            if (input.equalsIgnoreCase("fim")) {
                break;
            }

            String[] partes = input.split("-");
            if (partes.length != 2) {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            String nome = partes[0];
            String sexo = partes[1].toUpperCase();

            if (sexo.equals("M")) {
                nomesMasculinos.add(nome);
            } else if (sexo.equals("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Tente novamente.");
            }
        }

        System.out.println("Agora digite a opção que deseja executar:");
        System.out.println("(M) Listar pessoas do sexo masculino");
        System.out.println("(F) Listar pessoas do sexo feminino");
        String opcao = s.next();

        switch (opcao){
            case "M":
                System.out.println("******Nomes Masculinos:******");
                for (String nome : nomesMasculinos) {
                    System.out.println(nome);
                }
                break;
            case "F":
                System.out.println("******Nomes Femininos:******");
                for (String nome : nomesFemininos) {
                    System.out.println(nome);
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
