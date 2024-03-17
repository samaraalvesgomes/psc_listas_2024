import java.util.Scanner;
public class VendaAutomatica 
{
    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);
        int valorCompra, valorPago, troco;

        //Entrada
        System.out.println ("Valor da compra: ");
        valorCompra=entrada.nextInt();
        System.out.println ("Valor pago: ");
        valorPago=entrada.nextInt();

        //Processamento e saída
        if (valorPago >= valorCompra) {
            System.out.println("Troco: " + (troco = valorPago - valorCompra));

            int nota50 = 0;
            int nota20 = 0;
            int nota10 = 0;
            int nota5 = 0;
            int nota2 = 0;
            int nota1 = 0;

            if (troco >= 50) {
                nota50 = troco/50;
                troco = troco%50;
            }if (troco >= 20 && troco <= 49) {
                nota20 = troco/20;
                troco = troco%20;
            }if (troco >= 10 && troco <= 19) {
                nota10 = troco/10;
                troco = troco%10;
            }if (troco >= 5 && troco <= 9) {
                nota5 = troco/5;
                troco = troco%5;
            }if (troco >= 2 && troco <= 4) {
                nota2 = troco/2;
                troco = troco%2;
            }else{
                nota1 = troco;
            }

            System.out.println("Notas de R$50,00: " + nota50);
            System.out.println("Notas de R$20,00: " + nota20);
            System.out.println("Notas de R$10,00: " + nota10);
            System.out.println("Notas de R$5,00: " + nota5);
            System.out.println("Notas de R$2,00: " + nota2);
            System.out.println("Notas de R$1,00: " + nota1);

        } else {
            System.out.println("A quantia paga é insuficiente para realizar a compra!");
        }

        entrada.close();
    }
}
