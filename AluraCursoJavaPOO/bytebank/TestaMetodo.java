package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();

        contaDoPaulo.setSaldo(500);
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.getSaldo());
        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.getSaldo());

        Conta contaDaMarcela = new Conta();

        contaDaMarcela.deposita(1000);
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());
        contaDaMarcela.transfere(2000, contaDoPaulo);
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());
    }
}
