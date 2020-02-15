package Ex1;

public class Program {
    public static void main(String[] args) {
        AlunoFundamental af =
                new AlunoFundamental("Jeson", "11111", 10.0,1.0,3.0,5.0);
        AlunoGraduacao ag =
                new AlunoGraduacao("Maria", "2222", 8.9,7.3);
        AlunoPos ap =
                new AlunoPos("Jeane dark", "aaaaa", 10.0,10.0,10.0);

        Cadastro alunos = new Cadastro();
        alunos.adicionaAluno(af);
        alunos.adicionaAluno(ag);
        alunos.adicionaAluno(ap);

        alunos.exibeTodos();
    }
}
