package basico;

import java.util.Scanner;

public class Decisao {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Digite uma nota de 0 a 10 [-1 para finalizar]: ");
            nota = entrada.nextInt();
            // Se nota foi <-1 ou se a nota for > 10
            if (nota < -1 || nota > 10){
                System.out.println ("Nota inválida! Tente novamente!");
                continue;
            }
            // -1 é o valor que encerra o programa
            if (nota == -1){
                System.out.println("Encerrando o sistema!");
                break;
            }
            {
                if (nota >= 7) {
                    System.out.println("Passou direto");
                } else if (nota >= 4) {
                    System.out.println("Pegou exame!");
                } else if (nota >=0){
                    System.out.println("Reprovado!");
                }
            }
        } while (nota != -1);
    }
}