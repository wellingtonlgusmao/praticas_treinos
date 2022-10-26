package arrays;

import java.util.Scanner;

public class ConsoantesEX {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] consoantes = new String[6];
            int Qconsoantes = 0;
            int count = 0;
            do {
                System.out.println("Letra: ");
                String letra = scan.next();
                // System.out.println("Letra: ");
                if (!(letra.equalsIgnoreCase("a") |
                        letra.equalsIgnoreCase("e") |
                        letra.equalsIgnoreCase("i") |
                        letra.equalsIgnoreCase("o") |
                        letra.equalsIgnoreCase("u"))) {
                    consoantes[count] = letra;
                    Qconsoantes++;

                }
                count++;

            } while (count < consoantes.length);
            System.out.println("consoantes");
            for (String consoante : consoantes) {
                if (consoante != null) {
                    System.out.println(consoante + "");

                }

            }
            System.out.println(Qconsoantes);
            System.out.println(consoantes.length);
        }

    }
}
