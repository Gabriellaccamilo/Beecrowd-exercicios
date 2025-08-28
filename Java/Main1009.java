package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        double totalSalarioBonus;

        totalSalarioBonus = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalSalarioBonus);

        sc.close();

    }
}
