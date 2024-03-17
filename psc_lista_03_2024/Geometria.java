import java.util.Scanner;

public class Geometria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operacao;
        double raio, perimetro, area, volume;

        System.out.println("Qual operação deseja realizar? ");
        operacao = entrada.nextLine();
        System.out.println("Qual é o raio da figura? ");
        raio = entrada.nextDouble();

        if (operacao.equals("perímetro")) {
            perimetro = 2 * Math.PI * raio;
            System.out.println(perimetro);
        } else if (operacao.equals("área")) {
            area = Math.PI * raio * raio;
            System.out.println(area);
        } else if (operacao.equals("volume")) {
            volume = (4.0 / 3) * (Math.PI * raio * raio * raio);
            System.out.println(volume);
        } else {
            System.out.println("O código da operação é inválido!");
        }

        entrada.close();
    }
}


