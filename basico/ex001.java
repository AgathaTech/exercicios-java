import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.printf("Nota final = %.2f%n", media);

        if (media < 60.00) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}

