package com.darvueltaarray;

import java.util.Arrays;

/**
 * El método volterarArray funciona con arrays de tamaño par o impar indistintamente
 */
public class DarVueltaArray {
    public static void main(String[] args) {
        int[] arrayPrueba = {1, 2, 3}, otroArray;
        for(int num : arrayPrueba)
            System.out.println(num);

        otroArray = voltearArray(arrayPrueba);
        // Usando forEach() con Streams. Sobre otroArray no se puede usar directamente forEach(),
        //ya que los arrays de primitivos no tienen ese método
        Arrays.stream(otroArray).forEach(System.out::println);
    }
    static int[] voltearArray(int[] array){
        for(int i = 0; i < array.length / 2 ; i++) {
            int indiceDestino = array.length - 1 - i;
            //guardamos el valor de la posición por la que vamos
            int varAux = array[i];
            //metemos en esa posición el contenido de la otra
            array[i] = array[indiceDestino];
            //en la posición del índice de destino, metemos el valor
            //de la posición por la que vamos, que la guardamos en la variable auxiliar para
            //no pisarla con la asignación anterior
            array[indiceDestino] = varAux;
        }
        return array;
    }
}
/*
La complejidad temporal de este logaritmo es LINEAL, ya que cuantos más elementos haya, más tarda
la ejecución, de un modo proporcionado.
 */
