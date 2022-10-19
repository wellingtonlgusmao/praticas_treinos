package exercicio;

import java.util.Arrays;

public class ArraySimples {
    public static void main(String[] args) {
        String[] paises = { "Cuba", "China", "Brasil", "EUA", "EU" };

        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));
        int posicao = Arrays.binarySearch(paises, "Cuba");
        System.out.println(posicao);
        Arrays.sort(paises, 0, paises.length); // ordena o nosso array iniciando em zero
        System.out.println(Arrays.toString(paises)); // imprime o resultado em tela
    }
}
