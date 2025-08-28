package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1012 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double pi = 3.14159;

        double areatrianRetan = (a * c)/2;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTrapezio = (a + b) * c / 2;
        double areaQuad = b * b;
        double areaRetan = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areatrianRetan);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuad);
        System.out.printf("RETANGULO: %.3f%n", areaRetan);

        sc.close();
    }
}
