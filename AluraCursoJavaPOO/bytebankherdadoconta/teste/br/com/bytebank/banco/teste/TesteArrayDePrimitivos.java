package bytebankherdadoconta.teste.br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {
        int[] idades = new int[5];

//        idades[0] = 29;
//        idades[1] = 14;
//        idades[2] = 35;
//        idades[3] = 44;
//        idades[4] = 98;
//
//        int idades1 = idades[0];
//
//        System.out.println(idades1);
//        System.out.println(idades.length);

        for (int i = 0; i < idades.length; i++ ) {
            idades[i] = (i * i);
        }

        for (int i = 0; i < idades.length; i++ ) {
            System.out.println(idades[i]);
        }
    }
}
