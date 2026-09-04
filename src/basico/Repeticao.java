package basico;

public class Repeticao {
    public static void main(String[] args) {
        // Exemplo de for () crescente
        System.out.println("Lista de 1 até 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Exemplo de for () crescente
        System.out.println("Lista de 10 até 1");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " ");
        }
        // Versão crescente com while ()
        System.out.println("Lista crescente com while");
        int numero = 1; // inicialização da variável
        while (numero <=10){
            System.out.println(numero);
            numero++;
        }
        // Versão crescente com while ()
        System.out.println("Lista descrescente com while");
        int numero2 = 10; // inicialização da variável
        while (numero2 >=1){
            System.out.println(numero2);
            numero2--;
        }
    }
}
