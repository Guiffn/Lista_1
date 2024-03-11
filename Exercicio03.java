import java.util.Scanner;
public class Exercicio03 {

 public static void executar(){
 Scanner leitor = new Scanner(System.in);
 System.out.println("Digite um numero para A:");
 int A= leitor.nextInt();
 System.out.println("Digite um numero para B:");
 int B= leitor.nextInt();

 if(A>B){
    System.out.println("A é maior: "+A);
 } else if(A<B){
    System.out.println("B é maior: "+B);
 }else {
    System.out.println("Sequência de números informados é inválida");
 }



 leitor.close();
} 
}