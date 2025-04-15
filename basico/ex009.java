package basico;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valor = 0;

        switch (codigo) {
            case 1:
                valor = 4.00 * quantidade;
                break;
            case 2:
                valor = 4.50 * quantidade;
                break;
            case 3:
                valor = 5.00 * quantidade;
                break;
            case 4:
                valor = 2.00 * quantidade;
                break;
            case 5:
                valor = 1.50 * quantidade;
                break;
            default:
                System.out.println("Código inválido!");
        }
        System.out.printf("Total: R$ %.2f%n", valor);

        sc.close();
    }
}
