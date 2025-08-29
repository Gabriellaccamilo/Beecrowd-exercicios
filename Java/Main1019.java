package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        int horas = n/3600;
        n %= 3600;

        int minutos = n/60;
        n %= 60;

        int segundos = n%60;
        n %= 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        sc.close();

    }
}
