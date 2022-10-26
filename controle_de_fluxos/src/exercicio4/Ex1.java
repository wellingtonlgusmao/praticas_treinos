package exercicio4;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            // String nome;
            // int idade;

            while (true) {
                System.out.println("Nome: ");
                String nome = scan.next();
                if (nome.equals("0"))
                    break;

                System.out.println("Idade: ");
                int idade = scan.nextInt();
            }
        }

        System.out.println("Continua aqui...");

    }

}