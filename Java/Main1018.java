package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Main1018 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        int n = sc.nextInt();

        System.out.printf("%d%n", n);
        for(int nota : notas){
            System.out.printf("%d nota(s) de R$ %d,00%n", n / nota, nota);
            n %= nota;

        }

    }
}
