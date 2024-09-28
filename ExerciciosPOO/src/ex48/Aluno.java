package ex48;
import java.util.ArrayList;
import java.util.List;


public class Aluno extends Pessoa{
    private List<String> disciplinasMatriculadas;

    public Aluno(String nome) {
        super(nome);
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricularDisciplina(String disciplina) {
        if (!disciplinasMatriculadas.contains(disciplina)) {
            disciplinasMatriculadas.add(disciplina);
            System.out.printf("%s matriculado em %s.%n", nome, disciplina);
        } else {
            System.out.printf("%s já está matriculado em %s.%n", nome, disciplina);
        }
    }

    public List<String> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }
}

