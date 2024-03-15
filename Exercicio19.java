import java.util.Scanner;
public class Exercicio19{

 public static void executar(){
Scanner leitor = new Scanner(System.in);

 System.out.println("Digite o raio do cilindro:");
 double r = leitor.nextInt();
 System.out.println("Digite a altura do cilindro:");
 double h = leitor.nextInt();
 double volume= 3.14*(r*r)*h;

System.out.println("O volume do Cilindro: "+volume);

 leitor.close();
 }
}