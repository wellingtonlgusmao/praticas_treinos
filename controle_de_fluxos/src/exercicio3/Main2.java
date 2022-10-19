package exercicio3;

public class Main2 {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero2.areaQuadrilatero(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero2.areaQuadrilatero(5, 5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero2.areaQuadrilatero(7, 8, 9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
