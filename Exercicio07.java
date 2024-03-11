import java.util.Scanner;
public class Exercicio07{

 public static void executar(){
Scanner leitor = new Scanner(System.in);

 System.out.println(("Digite um numero: "));
 Double num = leitor.nextDouble();

 if(100<=num && num<=200){
 System.out.println("O numero informado esta entre 100 e 200");
 }else{
    System.out.println("O numeor informado não se encontra no intervelo entre 100 e 200");
 }

leitor.close();
 } 
}