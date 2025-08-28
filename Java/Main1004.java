package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main1004 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a, b, prod;

        a = sc.nextInt();
        b = sc.nextInt();

        prod = a * b;

        System.out.println("PROD = " + prod);

        sc.close();

    }
}
