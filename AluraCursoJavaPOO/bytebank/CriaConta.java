package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.setSaldo(50);

        System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
    }
}
