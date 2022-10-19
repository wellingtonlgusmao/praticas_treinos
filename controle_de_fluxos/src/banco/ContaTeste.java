package banco;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.cliente = "Daniel";
        conta.saldo = 4000.00;
        conta.exibesaldo();

        conta.saque(3000);
        conta.exibesaldo();
        conta.deposita(1500);
        conta.exibesaldo();

        Conta destino = new Conta();
        destino.cliente = "Carlos";
        destino.saldo = 5000.00;
        destino.exibesaldo();
    }
}
