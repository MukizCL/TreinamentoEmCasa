package bytebankherdadoconta;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        System.out.println("Valor (CC): " + cc.getSaldo());
        System.out.println("Valor (CP): " + cp.getSaldo() + "\n");

        cc.transfere(10.0, cp);

        System.out.println("Valor (CC): " + cc.getSaldo());
        System.out.println("Valor (CP): " + cp.getSaldo() + "\n");
    }
}
