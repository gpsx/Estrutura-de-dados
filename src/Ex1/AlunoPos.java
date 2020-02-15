package Ex1;

public class AlunoPos extends Aluno {
    private Double nota1;
    private Double nota2;
    private Double notaMonogtrafia;

    public AlunoPos(String nome, String ra, Double nota1, Double nota2, Double notaMonogtrafia) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonogtrafia = notaMonogtrafia;
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

    public Double getNotaMonogtrafia() {
        return notaMonogtrafia;
    }

    public void setNotaMonogtrafia(Double notaMonogtrafia) {
        this.notaMonogtrafia = notaMonogtrafia;
    }

    @Override
    public Double calcMedia() {
        return (nota1+nota2+notaMonogtrafia)/3;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " e teve as notas" +
                "\nnota1=" + nota1 +
                "\nnota2=" + nota2 +
                "\nnotaMonogtrafia=" + notaMonogtrafia +
                "\nE média "+ calcMedia();
    }
}
