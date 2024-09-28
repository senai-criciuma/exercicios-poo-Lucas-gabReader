package ex45;
import java.util.ArrayList;
import java.util.List;


public class Revista extends Item{
    private String periodicidade;

    public Revista(String titulo, String autor, String periodicidade) {
        super(titulo, autor);
        this.periodicidade = periodicidade;
    }

    @Override
    public String toString() {
        return String.format("Revista: %s (%s) - %s", titulo, autor, periodicidade);
    }
}

