package associacoes;

public class Funcionario {
    private String nome;
    private String titulo;

    public Funcionario(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    public String nomeCompleto () {
        return this.titulo + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
