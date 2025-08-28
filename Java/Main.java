package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorPecas1 = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorPecas2 = sc.nextDouble();

        double total = (numPecas1 * valorPecas1) + (numPecas2 * valorPecas2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();

    }
}
