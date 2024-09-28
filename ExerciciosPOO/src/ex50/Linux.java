package ex50;

public class Linux extends SistemaOperacional{
    public Linux(String versao) {
        super("Linux", versao);
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Sistema Operacional: %s, Versão: %s%n", nome, versao);
    }
}



