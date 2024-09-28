package ex50;

public abstract class SistemaOperacional {
    protected String nome;
    protected String versao;

    public SistemaOperacional(String nome, String versao) {
        this.nome = nome;
        this.versao = versao;
    }

    public String getNome() {
        return nome;
    }

    public String getVersao() {
        return versao;
    }

    public abstract void exibirInformacoes();
}

