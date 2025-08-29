package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1020 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        int ano = n / 365;
        n %= 365;

        int meses = n / 30;
        n %= 30;

        int dias = n;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, meses, dias);

        sc.close();

    }
}
