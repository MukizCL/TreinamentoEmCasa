package bytebank;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        paulo.setProfissao("Programador");

        System.out.println(paulo);
        System.out.println(conta.getTitular().getProfissao());

        conta.getTitular().setProfissao("Padeiro");

        System.out.println(paulo);
        System.out.println(conta.getTitular().getProfissao());
    }
}
