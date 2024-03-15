import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ponto X1 da sua cordenanda");
        double x1 = leitor.nextDouble();
        System.out.println("Digite o ponto X2 da sua cordenanda");
        double x2 = leitor.nextDouble();
        System.out.println("Digite o ponto Y1 da sua cordenanda");
        double y1 = leitor.nextDouble();
        System.out.println("Digite o ponto Y2 da sua cordenanda");
        double y2 = leitor.nextDouble();

        double distancia = Math.sqrt((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));

        System.out.println("A distancia entre os 2 pontos: " + distancia);

        leitor.close();
    }

}