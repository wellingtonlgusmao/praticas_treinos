package testesdio;

import java.util.Scanner;

/*Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.");
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número A");
            int A = leitor.nextInt();
            System.out.println("Digite um número N");
            int N = leitor.nextInt();

            for (int

            i = 0; i <= N; i++) {
                System.out.println(i);
            }

            int resultado = A * N;
            System.out.println(resultado);
        }

    }

}
