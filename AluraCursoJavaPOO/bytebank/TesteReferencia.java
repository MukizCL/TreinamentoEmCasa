package bytebank;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma coisa.");
        }

        primeiraConta.deposita(50);
    }
}
