import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar o maior número
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite 5 números:");

        // Loop para ler os 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Verifica se o número lido é maior que o atual maior número
            if (numero > maior) {
                maior = numero;
            }
        }

        // Exibindo o maior número
        System.out.println("O maior número digitado é: " + maior);

        scanner.close();
    }
}
