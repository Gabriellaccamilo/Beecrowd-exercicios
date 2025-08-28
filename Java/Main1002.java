package org.example;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1002 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio;
        raio = sc.nextDouble();
        double area =  3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);
    }
}
