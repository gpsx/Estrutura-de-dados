package Ex1;

public abstract class Aluno {
    private String nome;
    private String ra;

    @Override
    public String toString() {
        return "Ex1.Aluno " + nome + " com ra:" + ra;
    }

    public abstract Double calcMedia();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }
}
