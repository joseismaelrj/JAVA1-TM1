package br.com.meli;

public class EhPrimo {

        public static boolean ehPrimo(long numero){

            // verifica se o numero informado é divisiveo por 2
            if (numero % 2 == 0){
                return false;
            }
            for (long i=3; i<numero; i++){
                if (numero % i == 0){
                    return false;
                }
            }
            return true;
        }
}
