import java.util.Scanner;

public class ComPopulacional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            // Solicitar e validar a população do país A
            int populacaoA;
            do {
                System.out.print("Digite a população do país A: ");
                populacaoA = scanner.nextInt();
                if (populacaoA <= 0) {
                    System.out.println("População inválida. Deve ser um valor positivo.");
                }
            } while (populacaoA <= 0);

            // Solicitar e validar a taxa de crescimento do país A
            double taxaCrescimentoA;
            do {
                System.out.print("Digite a taxa de crescimento do país A (em decimal): ");
                taxaCrescimentoA = scanner.nextDouble();
                if (taxaCrescimentoA <= 0) {
                    System.out.println("Taxa de crescimento inválida. Deve ser um valor positivo.");
                }
            } while (taxaCrescimentoA <= 0);

            // Solicitar e validar a população do país B
            int populacaoB;
            do {
                System.out.print("Digite a população do país B: ");
                populacaoB = scanner.nextInt();
                if (populacaoB <= 0) {
                    System.out.println("População inválida. Deve ser um valor positivo.");
                }
            } while (populacaoB <= 0);

            // Solicitar e validar a taxa de crescimento do país B
            double taxaCrescimentoB;
            do {
                System.out.print("Digite a taxa de crescimento do país B (em decimal): ");
                taxaCrescimentoB = scanner.nextDouble();
                if (taxaCrescimentoB <= 0) {
                    System.out.println("Taxa de crescimento inválida. Deve ser um valor positivo.");
                }
            } while (taxaCrescimentoB <= 0);

            // Calcular o número de anos necessários para que A ultrapasse ou iguale B
            int anos = 0;
            while (populacaoA < populacaoB) {
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++;
            }

            // Exibir o resultado
            System.out.println("Levará " + anos + " anos para a população do país A ultrapassar ou igualar a população do país B.");
            
            // Perguntar ao usuário se deseja repetir a operação
            System.out.print("Deseja realizar outra comparação? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
