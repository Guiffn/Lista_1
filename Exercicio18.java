import java.util.Scanner;

public class Exercicio18 {

    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        double not1 = leitor.nextInt();
        System.out.println("Digite nota 2: ");
        double not2 = leitor.nextInt();
        System.out.println("Digite nota 3: ");
        double not3 = leitor.nextInt();

        double media =3/(1/not1 + 1/not2 + 1/not3);
        System.out.println("Resultado: " + media);
        leitor.close();
    }

}