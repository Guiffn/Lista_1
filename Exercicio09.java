import java.util.Scanner;
public class Exercicio09{

 public static void executar(){
Scanner leitor = new Scanner(System.in);

System.out.println("Digite um valor para A");
double A=leitor.nextDouble();

System.out.println("Digite um valor para B");
double B=leitor.nextDouble();

if(A!=B){
   if(A>B){
    System.out.println("A é maior q B");
   }else{
    System.out.println("B é maior q A");
   }
}else{
    System.out.println("OS valores são iguais.");
}




leitor.close();}
}