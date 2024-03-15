import java.util.Scanner;
public class Exercicio20{

 public static void executar(){
Scanner leitor = new Scanner(System.in);

 System.out.println("Digite o tempo da viajem em h ");
 double t = leitor.nextDouble();
 
 System.out.println("Digite a velocidade media da viajem ");
 double v = leitor.nextDouble();
 Double distancia=t*v;

 double litros = distancia/12;
 System.out.println("A quantidade de litros gasto foi de: "+litros);
 
leitor.close();
}



}
