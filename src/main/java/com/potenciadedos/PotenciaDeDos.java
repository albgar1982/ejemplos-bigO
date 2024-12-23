package com.potenciadedos;

/*
A qué número hay que elevar 2 para que dé el número que pasamos como argumento?
 */
public class PotenciaDeDos {
    public static void main(String[] args) {

        System.out.println(potenciaDe2(32));
        System.out.println(potenciaDe2(2));
        System.out.println(potenciaDe2(1));
    }

    private static int potenciaDe2(int valor) {

        int resultado = 0;

        while(valor > 1){
            resultado ++;
            valor /= 2;
        }
        return resultado;
    }
}
/*
Como cada iteración vamos dividiendo el valor entre 2, la complejidad es LOGARÍTMICA O(log N)
 */