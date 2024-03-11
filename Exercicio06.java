
import java.util.Scanner;
public class Exercicio06{

 public static void executar(){
Scanner leitor = new Scanner(System.in);
System.out.println("Digite o valor da temperatura em C°");
Double C = leitor.nextDouble();
Double F= (9*C+160)/5;

System.out.println("Celsius para Fahrenheit: "+F);


leitor.close();
 }
}