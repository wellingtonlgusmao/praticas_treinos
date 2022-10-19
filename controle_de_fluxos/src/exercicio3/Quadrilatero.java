package exercicio3;

public class Quadrilatero {
    public static void areaQuadrilatero(double ladoa) {
        double resultado = ladoa * ladoa;
        System.out.println("a area desse quadrado é " + resultado);
    }

    public static void areaQuadrilatero(double ladoa, double ladob) {
        double resultado = ladoa * ladob;
        System.out.println("a area desse retângulo é " + resultado);
    }

    public static void areaQuadrilatero(double ladoa, double ladob, double altura) {
        double resultado = ((ladoa + ladob) * altura) / 2;
        System.out.println("a area desse trapézio é " + resultado);
    }

}
