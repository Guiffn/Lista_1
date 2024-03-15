import java.util.Scanner;

public class Exercicio16 {

    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        double not1 = leitor.nextInt();
        System.out.println("Digite nota 2: ");
        double not2 = leitor.nextInt();
        System.out.println("Digite nota 3: ");
        double not3 = leitor.nextInt();

        double media = (not1 + not2 + not3) / 3;
        System.out.println("Resultado: " + media);

        leitor.close();
    }

}