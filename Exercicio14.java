import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite O primeiro termo da Progressão");
        int a1 = leitor.nextInt();
        System.out.println("Digite a razão ");
        int r = leitor.nextInt();
        System.out.println("Digite o primeiro (n) termo da Progressão");
        int n = leitor.nextInt();
        int an = a1 + (n - 1) * r;

        System.out.println("Resposta: " + an);

        leitor.close();
    }

}