import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NomesPorGrupo {
    public void separacaoSexo(){
        Map<String, String> nomesPorSexo = new HashMap<>();

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

            if (sexo.equals("M") || sexo.equals("F")) {
                nomesPorSexo.put(nome, sexo);
            } else {
                System.out.println("Sexo inválido. Tente novamente.");
            }
        }

        System.out.println("\n*****Nomes Masculinos*****");
        for (Map.Entry<String, String> entry : nomesPorSexo.entrySet()) {
            if (entry.getValue().equals("M")) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("\n*****Nomes Femininos*****");
        for (Map.Entry<String, String> entry : nomesPorSexo.entrySet()) {
            if (entry.getValue().equals("F")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
