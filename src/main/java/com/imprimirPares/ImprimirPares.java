package com.imprimirPares;

public class ImprimirPares {
    public static void main(String[] args) {

        char[] array = {'A','B','C','D'};

        for(int i = 0; i < array.length -1 ; i++) {
            for (int j = i +1 ; j < array.length ; j++){
                System.out.println( array[i] + "-" + array[j] );
            }
        }
    }
}
/*
A-B
A-C
A-D

B-C
B-D

C-D
La complejidad de este algoritmo es CUADRÁTICA. Por cada elemento nuevo, se recorren todos los elementos.
 */
