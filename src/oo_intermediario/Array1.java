package oo_intermediario;

public class Array1 {public static void main(String[] args) {
    int[] notas = {1, 3, 6};
    //             0  1  2
    System.out.println("Tamanho do array: " + notas.length);

    // Exibe do 1º em direção ao último elemento
    for (int i = 0; i < notas.length; i++) {
        System.out.println((i + 1) + "ª nota = " + notas[i]);
    }

    System.out.println("--------");

    // Exibe em ordem inversa
    for (int i = (notas.length-1); i >= 0; i--) {
        System.out.println((i + 1) + "ª nota = " + notas[i]);
    }

    // Calcula a média das notas: 5 + 6 + 7 + 8
    //                            -------------
    //                                  4
    int soma = 0;
    for (int i = 0; i < notas.length; i++) {
        soma += notas[i];
    }
    System.out.println("Soma = " + soma);

    double media = (double) soma / notas.length;
    System.out.printf("Media = %.2f", media);
}
}
