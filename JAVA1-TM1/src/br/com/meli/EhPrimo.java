package br.com.meli;

public class EhPrimo {

        public static boolean ehPrimo(long numero){

            // verifica se o numero informado é Par
            if (numero % 2 == 0){
                return false;
            }

            // Verifica se o número tem outro divisor alem de 1 e ele mesmo
            for (long i=3; i<numero; i++){
                if (numero % i == 0){
                    return false;
                }
            }
            return true;
        }
}
