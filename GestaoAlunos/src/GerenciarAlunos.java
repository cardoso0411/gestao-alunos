import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciarAlunos {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João Silva", "2021001", "Ciência da Computação");
        Aluno aluno2 = new Aluno("Maria Oliveira", "2021002", "Engenharia de Software");
        Aluno aluno3 = new Aluno("Pedro Santos", "2021003", "Sistemas de Informação");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        Atividade atividade1 = new Atividade("Prova de Matemática", "Prova final de Matemática", LocalDate.of(2024, 5, 10));
        Atividade atividade2 = new Atividade("Trabalho de Algoritmos", "Trabalho sobre Algoritmos", LocalDate.of(2024, 6, 15));
        Atividade atividade3 = new Atividade("Apresentação de Projeto", "Apresentação final de projeto", LocalDate.of(2024, 7, 20));
        Atividade atividade4 = new Atividade("Trabalho de Redes", "Trabalho sobre Redes", LocalDate.of(2024, 5, 10));
        Atividade atividade5 = new Atividade("Prova de Programação", "Prova final de Programação", LocalDate.of(2024, 6, 1));

        aluno1.adicionarAtividade(atividade1);
        aluno1.adicionarAtividade(atividade2);
        aluno2.adicionarAtividade(atividade3);
        aluno3.adicionarAtividade(atividade4);
        aluno3.adicionarAtividade(atividade5);

        // Exibir atividades e total de atividades de cada aluno
        for (Aluno aluno : alunos) {
            aluno.listarAtividades();
            System.out.println("Total de atividades: " + aluno.contarAtividades());
            System.out.println();
        }
    }
}