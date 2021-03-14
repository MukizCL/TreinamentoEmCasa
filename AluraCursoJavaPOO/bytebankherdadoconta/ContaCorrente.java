package bytebankherdadoconta;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.setSaldo(getSaldo() + valor);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.20;
        super.saca(valorASacar);
    }
}
