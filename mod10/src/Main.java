import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Float n1,n2,n3,n4;
        Scanner n = new Scanner(System.in);
        Calculadora media = new Calculadora();

        System.out.println("Digite 4 números");
        System.out.println("***********");
        System.out.println("Primeiro número:");
        n1 = n.nextFloat();
        System.out.println("Segundo número:");
        n2 = n.nextFloat();
        System.out.println("Terceiro número:");
        n3 = n.nextFloat();
        System.out.println("Quarto número:");
        n4 = n.nextFloat();
        media.calculaMedia(n1,n2,n3,n4);

    }
}