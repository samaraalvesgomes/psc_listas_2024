import java.util.Scanner;

public class Validacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e validação do nome
        String nome;
        do {
            System.out.print("Digite seu nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        // Solicitação e validação da idade
        int idade;
        do {
            System.out.print("Digite sua idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        // Solicitação e validação do salário
        double salario;
        do {
            System.out.print("Digite seu salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // Solicitação e validação do sexo
        char sexo;
        do {
            System.out.print("Digite seu sexo (f/m): ");
            sexo = scanner.next().charAt(0);
            sexo = Character.toLowerCase(sexo); // para aceitar tanto 'f' quanto 'F'
        } while (sexo != 'f' && sexo != 'm');

        // Solicitação e validação do estado civil
        char estadoCivil;
        do {
            System.out.print("Digite seu estado civil (s/c/v/d): ");
            estadoCivil = scanner.next().charAt(0);
            estadoCivil = Character.toLowerCase(estadoCivil); // para aceitar tanto 's', 'c', 'v', quanto 'd'
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        // Exibição das informações válidas
        System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
