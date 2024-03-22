public class Populacao {

    public static void main(String[] args) {
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;

        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015;

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Levará " + anos + " anos para a população do país A ultrapassar ou igualar a população do país B.");
    }
}
