package basico;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero inteiro para saber se é negativo ou não: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Numero negativo ");
            }
            else {
                System.out.println("Não negativo.");
            }

            sc.close();
    }
}
