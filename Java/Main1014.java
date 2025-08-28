package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();

        double total = x/y;

        System.out.printf("%.3f km/l%n", total);

        sc.close();

    }
}