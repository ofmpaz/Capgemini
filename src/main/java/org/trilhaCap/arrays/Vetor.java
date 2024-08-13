package org.trilhaCap.arrays;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrayDeNumeros = new int[3];

        arrayDeNumeros[0] = 5;
        arrayDeNumeros[1] = 78;
        arrayDeNumeros[2] = 13;

        for(int lista : arrayDeNumeros){
            System.out.println(lista);
        }

        System.out.println("-----------------------------");

        for(int i = 0; i < arrayDeNumeros.length; i++){
            System.out.println("Insira o valor do index: " + i);
            arrayDeNumeros[i] = sc.nextInt();
        }
        for(int lista2 : arrayDeNumeros){
            System.out.println(lista2);
        }
    }
}
