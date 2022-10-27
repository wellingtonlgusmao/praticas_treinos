package testesdio;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {

        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número (A)");
        int a = scanner.nextInt();

        System.out.println("Digite o primeiro número (B)");
        int b = scanner.nextInt();

        String resultado = (a == b) ? "Sao iguais! " : "Nao sao iguais! ";

        // imprimindo os dados obtidos para o usuario
        System.out.println(resultado);

    }

}
