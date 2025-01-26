public class Aluno {
    private String nome;
    private double notas;

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return this.notas / 3;
    }
}
