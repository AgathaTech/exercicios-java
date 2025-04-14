package basico;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double resultado = (numPecas1 * valorUnitario1) + (numPecas2 * valorUnitario2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n ", resultado);

        sc.close();
    }
}
