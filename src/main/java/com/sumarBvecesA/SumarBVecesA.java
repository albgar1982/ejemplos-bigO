package com.sumarBvecesA;

public class SumarBVecesA {
    public static void main(String[] args) {
        System.out.println( product(2,2) );
    }
    public static int product(int a, int b){
        int resultado = 0;
        for(int i = 0; i < b ; i++ )
            resultado += a;

        return resultado;
    }
}
/*
EL algoritmo va acumulando el valor de a en la variable resultado b veces.
La complejidad es lineal. Mira en el cuaderno la gráfica.
Cuanto mayor sea b, mayor será el tiempo de ejecución, sin importar el valor de a,
que simplemente es eso, un valor que se va sumando.
 */