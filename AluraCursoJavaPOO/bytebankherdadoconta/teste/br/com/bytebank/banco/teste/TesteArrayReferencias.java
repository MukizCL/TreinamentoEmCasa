package bytebankherdadoconta.teste.br.com.bytebank.banco.teste;

import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Cliente;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Conta;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        Object[] referencias = new Object[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 54);
        referencias[1] = cc2;

//        System.out.println(contas[1].getNumero());

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println(ref.getNumero());
    }
}
