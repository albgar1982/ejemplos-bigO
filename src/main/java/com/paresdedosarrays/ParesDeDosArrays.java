package com.paresdedosarrays;

public class ParesDeDosArrays {

    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {10,20};
        imprimeParesDeDosArrays(array1,array2);
    }

    public static void imprimeParesDeDosArrays(int[] arrayA, int[] arrayB){

        for( int valorA : arrayA){ //Complejidad lineal de A elementos, O(A)
            for(int valorB : arrayB){ //Complejidad lineal de B elementos, O(B)
                System.out.println(valorA + " - " + valorB);
            }
        }
    }
}

//La Complejidad final es O(A*B)
