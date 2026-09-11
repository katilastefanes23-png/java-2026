package oo;

public class TestaPessoa {
    public static void main(String[] args) {
       //a partir da classe pessoa
        Pessoa fulano= new Pessoa();
        fulano.nome = "Fulano de Souza";
        fulano.idade= 18;
        fulano.peso= 80.5;
        System.out.printf("%s tem %d anos e pesa %.2f kg\n",
                fulano.nome, fulano.idade, fulano.peso);
        fulano.comer();
        fulano.dormir();
        fulano.respirar();

        System.out.println("\n====================");

                //atividade com nosso nome
        Pessoa katila = new Pessoa();
        katila.nome = "Kátila Thaiana Stefanes";
                katila.idade=30;
        katila.peso=67.5;
        System.out.printf("\n%s tem %d anos e pesa %.2f kg\n",
                katila.nome,katila.idade, katila.peso);
        katila.comer();
        katila.dormir();
        katila.respirar();
    }
}
