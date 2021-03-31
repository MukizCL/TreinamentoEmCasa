package bytebankherdadoconta.teste.br.com.bytebank.banco.teste;

import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Conta;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencia {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adicionar(cc);

        Conta cc2 = new ContaCorrente(22, 19);
        guardador.adicionar(cc2);

        int tamanho = guardador.getQuantidadedeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta)guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
