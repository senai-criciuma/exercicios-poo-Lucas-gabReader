package ex45;
import java.util.ArrayList;
import java.util.List;


public class Item {
    protected String titulo;
    protected String autor;

    public Item(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return String.format("%s por %s", titulo, autor);
    }
}

