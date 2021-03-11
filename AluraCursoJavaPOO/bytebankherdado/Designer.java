package bytebankherdado;

public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método do Designer!");
        return 200;
    }
}
