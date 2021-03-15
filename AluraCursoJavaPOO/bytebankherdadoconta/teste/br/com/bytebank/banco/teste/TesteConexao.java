package bytebankherdadoconta.teste.br.com.bytebank.banco.teste;

import bytebankherdadoconta.teste.br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {
    public static void main(String[] args) {

        // Essas 5 linhas substituem...
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexão!");
        }

        // ... essas 9 linhas abaixo.
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch(IllegalStateException ise) {
//            System.out.println("Deu erro na conexão!");
//        } finally {
//            con.close();
//        }
    }
}
