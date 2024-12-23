package com.aniadirelementoenarray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AniadirElemento {

    public static void main(String[] args) {
        int[] numArray = {1,2,3,4};

        System.out.println(Arrays.stream(numArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));

        /*
        Arrays.stream(numArray): Convierte el array de int en un stream.
        .mapToObj(String::valueOf): Convierte cada número en una cadena para poder concatenarlos.
        .collect(Collectors.joining(",")): Une todos los elementos del stream en un solo String, separados por comas.
        System.out.println(...): Imprime el resultado final.
         */
        int[] numArrayCopia = copiarArray(numArray);

        System.out.println(Arrays.stream(numArrayCopia)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));
    }


    public static int[] copiarArray(int[] array){
        int[] copia = new int[0]; //Solo es una inicialización

        for(int valor : array){    //Se recorren todos los elementos, por tanto es complejidad LINEAL O(N)
            copia = aniadirANuevo(copia,valor);
        }
        return copia;
    }

    public static int[] aniadirANuevo(int[] array, int valor){

        int[] mayorArray = new int[array.length + 1]; //Creo un array de un elemento más que el que me han pasado como argumento

        for(int i = 0; i < array.length; i++) //Relleno mayorArray con cada valor de array. Se recorren todos los elementos, por tanto es complejidad LINEAL O(N)
            mayorArray[i] = array[i];

        mayorArray[mayorArray.length -1] = valor; //En el último elemento, asigno el valor que me pasaron

        return mayorArray;
    }
}

/*
La complejidad final es O(N * N) -> O(N^2) Complejidad CUADRÁTICA
 */