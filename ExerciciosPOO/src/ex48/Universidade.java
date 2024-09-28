package ex48;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Universidade {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private Map<String, String> horarios;

    public Universidade() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        horarios = new HashMap<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.printf("Aluno %s adicionado.%n", aluno.getNome());
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        horarios.put(professor.getDisciplina(), professor.getNome());
        System.out.printf("Professor %s adicionado para a disciplina %s.%n", professor.getNome(), professor.getDisciplina());
    }

    public void matricularAlunoEmDisciplina(String nomeAluno, String disciplina) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.matricularDisciplina(disciplina);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void consultarHorarios() {
        System.out.println("Horários de aulas:");
        for (Map.Entry<String, String> entry : horarios.entrySet()) {
            System.out.printf("Disciplina: %s - Professor: %s%n", entry.getKey(), entry.getValue());
        }
    }
}

