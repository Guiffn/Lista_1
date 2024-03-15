import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        double not1 = leitor.nextInt();
        System.out.println("Digite seu peso: ");
        double p1 = leitor.nextInt();

        System.out.println("Digite nota 2: ");
        double not2 = leitor.nextInt();
        System.out.println("Digite seu peso: ");
        double p2 = leitor.nextInt();

        System.out.println("Digite nota 3: ");
        double not3 = leitor.nextInt();
        System.out.println("Digite seu peso: ");
        double p3 = leitor.nextInt();

        double media = (not1 * p1 + not2 * p2 + not3 * p3) / p1 + p2 + p3;
        System.out.println("Resultado: " + media);

        leitor.close();
    }

}