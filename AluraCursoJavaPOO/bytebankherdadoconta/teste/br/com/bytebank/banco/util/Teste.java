package bytebankherdadoconta.teste.br.com.bytebank.banco.util;

import bytebank.Cliente;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Conta;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Teste {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        System.out.println("---------");

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        // Nessa ______, sorteie usando como parâmetro a receber (x e y) dessa maneira -> ______;
        lista.sort(                                                         // Lambda - Sem usar o 'new Comparator<Conta>()', sem usar return e sem iniciar um novo método com 'public int compare(Conta c1, Conta c2)'.
                (Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero())
        );

        Comparator<Conta> comp = (Conta c1, Conta c2) -> {                  // Lambda - Sem usar o '... = new' e sem iniciar um novo método com 'public int compare'.
                String nomeConta1 = c1.getTitular().getNome();
                String nomeConta2 = c2.getTitular().getNome();
                return nomeConta1.compareToIgnoreCase(nomeConta2);
        };

        System.out.println("---------");

        // Nessa ______, para cada (______) faça -> ______;
        lista.forEach( (Conta conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()) );

    }
}