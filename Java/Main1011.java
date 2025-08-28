package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int raio = sc.nextInt();

        double volume;

        volume = (4/3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();

    }
}
