package basico;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHoras = sc.nextDouble();
        double salario = horasTrabalhadas * valorHoras;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = US$ %.2f%n", salario);

        sc.close();

    }
}
