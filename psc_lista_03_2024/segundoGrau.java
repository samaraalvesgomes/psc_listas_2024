import java.util.Scanner;
public class segundoGrau {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float a, b, c, delta;

        System.out.println("Digite o coeficiente A: ");
        a=entrada.nextFloat();
        System.out.println("Digite o coeficiente b: ");
        b=entrada.nextFloat();
        System.out.println("Digite o coeficiente C: ");
        c=entrada.nextFloat();
        
        delta = (b * b) - (4*a*c);
    
        if (a==0 && b==0 && c!=0){
            System.out.println("Coeficientes informados incorretamente.");
        }else if (a==0 && b!=0){
            System.out.println("Essa é uma equação de primeiro grau.");
        }else if (delta<0){
            System.out.println("Esta equação não possui raízes reais.");
        }else if (delta==0){
            System.out.println("Esta equação possui duas raízes reais iguais.");
        }else {
            System.out.println("Esta equação possui duas raízes reais diferentes. ");
            
            double raizA = (-b + Math.sqrt(delta)) / (2 * a);
            double raizB = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Valor da primeira raiz real: " + raizA);
            System.out.println("Valor da segunda raiz real: " + raizB);
        }

        entrada.close();
    }

}
