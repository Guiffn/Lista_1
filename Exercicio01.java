import java.util.Scanner;
public class Exercicio01{

 public static void executar(){
Scanner leitor = new Scanner(System.in);

 System.out.println("DIgite um numero");
 int num = leitor.nextInt();
 if(num>10){
 System.out.println("Numero maior do que 10");
}else{
    System.out.println("Numero menor ou igual a 10");
}

leitor.close();
}



}