import java.util.Scanner;

public class IntervaloNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir os dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Verifica qual é o menor e qual é o maior número
        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        // Imprime os números no intervalo entre os dois números fornecidos
        System.out.println("Números no intervalo entre " + menorNumero + " e " + maiorNumero + ":");

        for (int i = menorNumero; i <= maiorNumero; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
