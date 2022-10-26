package arrays;

public class OrdemInversaOutra {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] vetor = { 1, 2, 3, 4, 5 };
        System.out.println("vetor :");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + "");
            count++;
        }
        System.out.println("vetor :");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + "");
        }

    }
}
