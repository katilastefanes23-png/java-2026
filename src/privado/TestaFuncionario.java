package privado;

public class TestaFuncionario {
    public static void main (String[] args)
    {
        Funcionario fulano = new Funcionario("Kátila Stefanes", 30, 8000.00);

       /* fulano.setNome ("Kátila Stefanes");
        fulano.setIdade (30);
        fulano.setSalario (8000.00); */

        System.out.println("Nome: " +fulano.getNome());
        System.out.println("Idade: " +fulano.getIdade());
        System.out.println("Salário: " +fulano.getSalario());

    }
}
