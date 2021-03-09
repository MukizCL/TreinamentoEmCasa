package bytebank;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.setSaldo(300);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;

        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma coisa.");
        }

        primeiraConta.deposita(50);
    }
}
