package ex45;
import java.util.ArrayList;
import java.util.List;

public class Livro extends Item{
    private String genero;

    public Livro(String titulo, String autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("Livro: %s (%s) - %s", titulo, autor, genero);
    }
}





