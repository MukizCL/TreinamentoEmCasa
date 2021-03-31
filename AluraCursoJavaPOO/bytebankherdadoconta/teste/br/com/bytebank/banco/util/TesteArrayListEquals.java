package bytebankherdadoconta.teste.br.com.bytebank.banco.util;

import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Conta;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        LinkedList<Conta> lista = new LinkedList<Conta>();             // O que fica entre os '<>' significa que só vai aceitar o tipo de referencia que está dentro daquelas '<>'.
                                                                    // Os '<>' se chamam de 'Generics'.
        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);

        System.out.println("");

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe: " + existe);
    }
}
