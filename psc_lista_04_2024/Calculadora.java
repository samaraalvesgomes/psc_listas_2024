import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar a soma e a média
        int soma = 0;
        double media;

        System.out.println("Digite 5 números:");

        // Loop para ler os 5 números e calcular a soma
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        // Calcular a média
        media = (double) soma / 5;

        // Exibindo a soma e a média
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
