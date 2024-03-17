import java.util.Scanner;
import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = entrada.nextInt();

        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        int sorteio = gerador.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + sorteio);

        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }

        entrada.close();
    }
}
