package ex47;
import java.util.ArrayList;
import java.util.List;


public class Loja {
    private List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.printf("Produto adicionado: %s%n", produto);
    }

    public void removerProduto(String nome) {
        return;
            }

    public void buscarProdutoPorNome(String nome) {
        return;
            }

    public void buscarProdutoPorCategoria(String categoria) {
        boolean encontrado = false;
        System.out.println("Produtos encontrados na categoria " + categoria + ":");
        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(produto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum produto encontrado nessa categoria.");
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos na loja:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}



