package bytebankherdadoconta.teste.br.com.bytebank.banco.util;

import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Cliente;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Conta;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();            // O que fica entre os '<>' significa que só vai aceitar o tipo de referencia que está dentro daquelas '<>'.
                                                                    // Os '<>' se chamam de 'Generics'.
        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

//        Cliente cliente = new Cliente();
//        lista.add(cliente);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("");

        System.out.println("Tamanho: " + lista.size());
        Conta ref = (Conta)lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        System.out.println("");

        Conta cc3 = new ContaCorrente(22, 57);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 74);
        lista.add(cc4);

        System.out.println("");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("");

        for(Conta conta : lista) {
            System.out.println(conta);
        }

    }
}
