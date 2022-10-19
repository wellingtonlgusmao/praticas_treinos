package exercicios2;

public class Operando {

    public static void main(String[] args) {
        System.out.println("inicio da calculadora");
        Calculadora.soma(2, 3);
        Calculadora.subtracao(2, 3);
        Calculadora.multiplicar(2, 3);
        Calculadora.dividir(2, 3);
        System.out.println("inicio das mensagens");
        Mensagens.obterMensagem(5);
        Mensagens.obterMensagem(45);
        Emprestimo.calcular(2000, 2);
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());

    }

}
