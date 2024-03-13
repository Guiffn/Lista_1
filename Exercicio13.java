import java.util.Scanner;
public class Exercicio13{

 public static void executar(){
Scanner leitor = new Scanner(System.in);
System.out.println("Digite um valor inteiro");
int A = leitor.nextInt();

System.out.println("Digite outro valor inteiro");
int B = leitor.nextInt();

System.out.println("Digite o caractere da operação: ");
String C= leitor.next();
switch (C) {
    case "*": int R=A*B;
System.out.println("Resposta:"+R);        
        break;
        case "/": R=A/B;
        System.out.println("Resposta:"+R);        
                break;
        case "+": R=A+B;
        System.out.println("Resposta:"+R);        
                break;
        case "-": R=A-B;
        System.out.println("Resposta:"+R);        
         break;

    default:System.out.println("Valores Invalidos"); 
        break;

}



leitor.close();
}



}