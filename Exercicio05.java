import java.util.Scanner;
public class Exercicio05{

 public static void executar(){
Scanner leitor = new Scanner(System.in);
System.out.println("Digite um valor:");
Double A = leitor.nextDouble();
System.out.println("Digite outro valor");
Double B = leitor.nextDouble();

System.out.println("Valor de A:"+A);
System.out.println("Valor de B:"+B);
double C = A;
A=B;
B=C;
System.out.println("Valor de A:"+A);
System.out.println("Valor de B:"+B);




leitor.close();
 }
}