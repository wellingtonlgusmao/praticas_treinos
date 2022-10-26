package arrays;
/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatoriosEX {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        }
        Random random = new Random();
        int[] NumerosAl = new int[3];

        for (int i = 0; i < NumerosAl.length; i++) {
            int numero = random.nextInt(100);
            NumerosAl[i] = numero;
        }

        System.out.println("numeros aleatorios:");
        for (int numero : NumerosAl) {
            System.out.println(numero + "");
        }
        System.out.println("");
        System.out.println("sucessores dos numeros aleatorios:");
        for (int numero : NumerosAl) {
            System.out.println((numero + 1) + "");

        }

    }
}
