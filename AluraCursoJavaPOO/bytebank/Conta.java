package bytebank;

import org.w3c.dom.ls.LSOutput;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Foi adicionado " + valor + " reais.");
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Valor do saque é maior que o valor do saldo.");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("Valor do transferência é maior que o valor do saldo.");
            return false;
        }
    }

}
