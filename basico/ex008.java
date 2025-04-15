package basico;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        if (horaFinal > horaInicial) {
            int duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou " + duracao + " HORA(S) ");
        } else if (horaInicial > horaFinal) {
            int duracao = (24 - horaInicial) + horaFinal;
            System.out.println("O jogo durou " + duracao + " HORA(S) ");
        } else {
            int duracao = 24;
            System.out.println("O jogo durou " + duracao + " HORA(S) ");
        }
        sc.close();
    }
}
