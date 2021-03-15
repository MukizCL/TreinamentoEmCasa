package bytebankherdadoconta.teste.br.com.bytebank.banco.teste;

import bytebankherdadoconta.teste.br.com.bytebank.banco.especial.ContaEspecial;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaPoupanca;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.deposita(200.0);

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
