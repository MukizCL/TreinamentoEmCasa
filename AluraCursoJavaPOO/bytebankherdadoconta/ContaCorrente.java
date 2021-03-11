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
    public boolean saca(double valor) {
        double valorASacar = valor + 0.20;
        return super.saca(valorASacar);
    }
}
