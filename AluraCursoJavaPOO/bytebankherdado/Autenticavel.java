package bytebankherdado;

public abstract interface Autenticavel { // Quem assina esse contrato precisa implementar os seguintes métodos:

    public void setSenha(int senha);

    public boolean autentica(int senha);

}
