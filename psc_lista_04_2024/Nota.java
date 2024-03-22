import java.util.Scanner;
public class Nota {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int nota;

        System.out.println("Escreva uma nota entre 0 e 10:");
            nota=scanner.nextInt();

        while(nota<0 || nota>10){
            System.out.println("Valor inválido! Escreva um valor válido.");
            System.out.println("Escreva uma nota entre 0 e 10:");
            nota=scanner.nextInt();
        }
            
        System.out.println("Você digitou " + nota);
        

        scanner.close();
    }
     
}