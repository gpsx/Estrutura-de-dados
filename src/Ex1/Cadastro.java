package Ex1;

import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Aluno> alunos;

    public Cadastro() {
        alunos = new ArrayList<Aluno>();
    }

    public void adicionaAluno(Aluno a){
        alunos.add(a);
    }

    public void exibeTodos(){
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
