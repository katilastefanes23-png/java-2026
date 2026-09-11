package basico;

import java.util.Scanner;

public class Decisao {
    static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Digite uma nota de 0 a 10: ");
        int nota = entrada.nextInt();
        {
            if (nota >= 7) {
                System.out.println("Passou direto");
            } else if (nota >= 4) {
                System.out.println("Pegou exame!");
            } else {
                System.out.println("Reprovado!");
            }
        }
    }
}