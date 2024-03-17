import java.util.Scanner;
public class Calculadora
{
    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);
        float num1, num2, num3, maior, menor, media;
        
        //Entrada
        System.out.println("Escreva o primeiro número: "); 
        num1=entrada.nextFloat();
        System.out.println("Escreva o segundo número: "); 
        num2=entrada.nextFloat();
        System.out.println("Escreva o terceiro número: "); 
        num3=entrada.nextFloat();
        
        //Processamento
        maior = Math.max (num1,Math.max(num2,num3));
        menor = Math.min (num1,Math.min(num2,num3));
        media = (num1 + num2 + num3)/3;
        
        //Saída
        System.out.println("O maior número é "+ maior);
        System.out.println("O menor número é "+ menor);
        System.out.println("A média é "+ media);

        entrada.close();
    }
}
