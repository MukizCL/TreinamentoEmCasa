package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();

        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);
        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);

        Conta contaDaMarcela = new Conta();

        contaDaMarcela.deposita(1000);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
        contaDaMarcela.transfere(2000, contaDoPaulo);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "Paulo Silveira";

    }
}
