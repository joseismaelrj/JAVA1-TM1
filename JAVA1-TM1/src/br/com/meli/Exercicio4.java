package br.com.meli;

import java.util.Scanner;
import static br.com.meli.EhPrimo.ehPrimo;

public class Exercicio4 {
    public void executar(){
        System.out.println("Digite um valor para que retorne os numero primos de 1 ate ele:");
        Scanner limite = new Scanner(System.in);
        long n = limite.nextInt();
        if (n == 1) {
            System.out.println("2 - é primo / posição - 1");
        } else{
            System.out.println("2 - é primo / posição - 1");
            long cont=2;
            long pos=3;
            while (cont <= n) {
                boolean resp = ehPrimo(pos);
                if(resp == true) {
                    System.out.println(pos + " - é Primo / posição - " + cont);
                    cont++;
                 }
                pos++;
            }
        }
    }

}