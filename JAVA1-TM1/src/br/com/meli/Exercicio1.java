package br.com.meli;
import java.util.Scanner;

public class Exercicio1 {

    public void executar() {
        System.out.print("Digite a quantidade de números pares que deseja ver: ");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        for (long i = 2; i < (n * 2);i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}