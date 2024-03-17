import java.util.Scanner;
public class Simbolos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, conta;
        String operador;

        System.out.println("Escreva o primeiro número: "); 
        num1=entrada.nextFloat();
        System.out.println("Escreva o segundo número: "); 
        num2=entrada.nextFloat();
        System.out.println("Escreva o operador: "); 
        operador=entrada.nextLine();

        
        if (operador == "+") {

            conta = num1 + num2;
            System.out.println(conta);
            
        } else if (operador == "-") {

            conta = num1 - num2;
            System.out.println(conta);
            
        }else if (operador == "*") {

            conta = num1 * num2;
            System.out.println(conta);
            
        }else if (operador == "/") {

            conta = num1 / num2;
            System.out.println(conta);
            
        }else if (operador == "^") {

            conta = (float) Math.pow(num1, num2);
            System.out.println(conta);
            
        }else{
            System.out.println("Essa operação não é válida!");
        }

        entrada.close();
    }
}
