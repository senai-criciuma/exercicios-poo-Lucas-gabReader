package ex50;

public class macOs extends SistemaOperacional{
    public macOs (String versao) {
        super("macOS", versao);
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Sistema Operacional: %s, Versão: %s%n", nome, versao);
    }
}

