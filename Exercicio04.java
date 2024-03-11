import java.util.Scanner;
public class Exercicio04 {

 public static void executar(){

 Scanner leitor = new Scanner(System.in);
 System.out.println("Digite um numero: ");
 double num1 = leitor.nextDouble();
 System.out.println("Digite um numero: ");
 double num2= leitor.nextDouble();

  Double soma= num1+ num2;
  double sub=num1-num2;
  double multi = num1*num2;
  double divi = num1/num2;
System.out.println("O resultado da Soma dos numeros: "+soma);
System.out.println("O resultado da Subtração dos numeros: "+sub);
System.out.println("O resultado da Mulriplicação: "+multi);
System.out.println("O resultado da Divisão dos numeros: "+divi);




 leitor.close();
} 
}
