package br.com.meli;
import java.util.Scanner;

public class Exercicio2 {

    public void executar() {
        System.out.print("Digite a quantidade de números que deseja ver: ");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt(); // 4
        System.out.print("Digite o múltiplo desejado: ");
        long m = scanner.nextInt(); // 4
        for (long i = 1; i < n; i++) {
            System.out.println(m * i);
        }
    }
}