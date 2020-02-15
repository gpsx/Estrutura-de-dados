package Ex1;

public class AlunoGraduacao extends Aluno {
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(String nome, String ra, Double nota1, Double nota2) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "e teve as notas" +
                "\nnota1=" + nota1 +
                "\nnota2=" + nota2 +
                "\nE média "+ calcMedia();
    }

    @Override
    public Double calcMedia() {
        return (nota1+nota2)/2;
    }
}
