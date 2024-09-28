package ex49;
import java.util.ArrayList;
import java.util.List;


public class Restaurante {
    private List<Prato> cardapio;

    public Restaurante() {
        cardapio = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        cardapio.add(prato);
        System.out.printf("Prato adicionado: %s%n", prato);
    }

    public void removerPrato(String nome) {
        for (int i = 0; i < cardapio.size(); i++) {
            if (cardapio.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.printf("Prato removido: %s%n", cardapio.get(i));
                cardapio.remove(i);
                return;
            }
        }
        System.out.println("Prato não encontrado.");
    }

    public void buscarPratoPorNome(String nome) {
        for (Prato prato : cardapio) {
            if (prato.getNome().equalsIgnoreCase(nome)) {
                System.out.printf("Prato encontrado: %s%n", prato);
                return;
            }
        }
        System.out.println("Prato não encontrado.");
    }

    public void buscarPratoPorCategoria(String categoria) {
        boolean encontrado = false;
        System.out.println("Pratos encontrados na categoria " + categoria + ":");
        for (Prato prato : cardapio) {
            if (prato.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(prato);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum prato encontrado nessa categoria.");
        }
    }

    public void listarCardapio() {
        System.out.println("Cardápio:");
        for (Prato prato : cardapio) {
            System.out.println(prato);
        }
    }
}

