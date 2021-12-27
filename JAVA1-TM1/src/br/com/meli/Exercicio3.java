package br.com.meli;

import java.util.Scanner;

import static br.com.meli.EhPrimo.ehPrimo;

public class Exercicio3 {

    public void executar () {

        System.out.print("Informe um número para saber se ele é primo: ");
        Scanner entrada = new Scanner(System.in);
        long n = entrada.nextInt();
        if (n > 2){

            boolean resp = ehPrimo(n);
            if(resp == true) {
                System.out.println("O Numero informado é Primo");
            }else{
                System.out.println("O Numero informado não é Primo");
            }
        } else {
            if (n < 2) {
                System.out.println("O Numero informado não é Primo");

            } else {
                System.out.println("O Numero informado é Primo");
            }
        }
    }
}
