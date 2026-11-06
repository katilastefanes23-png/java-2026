package oo_intermediario;

import java.math.BigDecimal;

public class Funcionario {
    // Define duas constantes representando a faixa etária válida
    final int IDADE_MINIMA = 18;
    final int IDADE_MAXIMA = 70;

    private String nome;
    private int idade;
    private BigDecimal salario;

    public Funcionario(String nome, int idade, BigDecimal salario) {
        this.nome = nome;
        this.setIdade(idade);
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public BigDecimal getSalario() { return salario; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= IDADE_MINIMA && idade <= IDADE_MAXIMA) {
            this.idade = idade;
        } else {
            this.idade = IDADE_MINIMA;
            System.out.println("Idade inválida - faixa entre 18 e 70 anos!");
        }
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
