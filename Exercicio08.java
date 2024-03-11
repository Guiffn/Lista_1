import java.util.Scanner;
public class Exercicio08{

 public static void executar(){
Scanner leitor = new Scanner(System.in);

System.out.println("Digite um numero");
Double num= leitor.nextDouble();
if(num>=50){
    System.out.println("O numero digitado é maior ou igual a 50");
}else{
    System.out.println("O numero digitado é menor que 50");
}


leitor.close();
 }
}