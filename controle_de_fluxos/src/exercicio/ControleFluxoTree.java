package exercicio;

public class ControleFluxoTree {

    /* Método principal da classe */
    public static void main(String[] args) {
        int idade = 19;
        if (idade <= 7) {
            // a idade é menor ou igual a 7?

            System.out.println("Ainda é uma criança");

            // se verdadeiro, imprima
        } else if (idade > 7 && idade <= 18) {

            // a idade é maior que 7 e menor ou igual a 18?

            System.out.println("É um adolescente");

            // se verdadeiro, imprima

        } else if (idade > 18 && idade <= 60) {

            // a idade é maior que 18 e menor ou igual a 60?

            System.out.println("É um adolescente");

            // se verdadeiro, imprima
        } else {

            System.out.println("Está na melhor idade");

            // senao, imprima

        }
    }
}