public class Turma {

    private int serie;
    private int quantidadeDeAlunos;

    public Turma(int serie, int quantidadeDeAlunos) {
        this.serie = serie;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getSerie() {
        return serie;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
