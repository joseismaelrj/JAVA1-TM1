package br.com.meli;

import java.util.Scanner;
import static br.com.meli.EhPrimo.ehPrimo;

public class Exercicio4 {
    public void executar(){
        System.out.println("Digite um valor para que retorne os numero primos de 1 ate ele:");
        Scanner limite = new Scanner(System.in);
        long n = limite.nextInt();
        if (n == 1) {
            System.out.println("O número 2 é primo");
        } else{
            for (long i = 3; i <= n; i++){
                boolean resp = ehPrimo(i);
                if(resp == true) {
                    System.out.println("O Numero " + i + "é Primo");
                }
            }
        }
    }

}