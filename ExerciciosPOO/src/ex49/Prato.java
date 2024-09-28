package ex49;

public class Prato {
    private String nome;
    private String categoria;
    private double preco;

    public Prato(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("Prato: %s, Categoria: %s, Preço: R$%.2f", nome, categoria, preco);
    }
}

