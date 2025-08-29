package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1016 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        int total = km * 2;

        System.out.printf("%d minutos%n", total);

        sc.close();

    }
}
