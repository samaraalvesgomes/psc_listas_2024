import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;

        System.out.println("Nome de usuário:");
        nome = scanner.nextLine();
        System.out.println("Senha:");
        senha = scanner.nextLine();

        while (nome.equals(senha)) {
            System.out.println("Login inválido! O nome de usuário e a senha não podem ser iguais.");

            System.out.println("Nome de usuário:");
            nome = scanner.nextLine();
            System.out.println("Senha:");
            senha = scanner.nextLine();
        }
        System.out.println("Acesso permitido!");

        scanner.close();
    }
}

