package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1007 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int dif = (a * b - c * d);

        System.out.println("DIFERENCA = " + dif);

        sc.close();

    }
}
