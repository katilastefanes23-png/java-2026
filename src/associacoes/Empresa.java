package associacoes;

public class Empresa {
    private String nome;
    private String endereco;
    private boolean matriz;

private Funcionario diretora;

    public Empresa(String nome, String endereco, boolean matriz) {
        this.nome = nome;
        this.endereco = endereco;
        this.matriz = matriz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isMatriz() {
        return matriz;
    }

    public void setMatriz(boolean matriz) {
        this.matriz = matriz;
    }

    public Funcionario getDiretora() {
        return diretora;
    }

    public void setDiretora(Funcionario diretora) {
        this.diretora = diretora;
    }
}
