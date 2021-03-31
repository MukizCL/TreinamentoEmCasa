package bytebankherdadoconta.teste.br.com.bytebank.banco.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);         // Autoboxing.
        System.out.println(idadeRef.intValue());        // Unboxing.

        // Double dRef = new Double(3.2);
        Double dRef = Double.valueOf(3.2);              // Autoboxing.
        System.out.println(dRef.doubleValue());         // Unboxing.

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(45f);
    }

}
