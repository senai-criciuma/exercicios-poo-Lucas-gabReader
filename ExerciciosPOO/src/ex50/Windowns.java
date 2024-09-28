package ex50;

public class Windowns extends SistemaOperacional{
    public Windowns(String versao) {
        super("Windows", versao);
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Sistema Operacional: %s, Versão: %s%n", nome, versao);
    }
}



