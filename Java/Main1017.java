package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt();
        double y = sc.nextInt();
        double z;

        z = (y/12) * x;

        System.out.printf("%.3f%n", z);

        sc.close();

    }
}
