package org.example;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main1008 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFunc, numHorasT;
        double valorHora;
        double salario;

        numFunc = sc.nextInt();
        numHorasT = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = numHorasT * valorHora;

        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();

    }
}
