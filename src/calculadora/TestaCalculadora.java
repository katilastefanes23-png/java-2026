package calculadora;

import javax.swing.*;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(50, 100));
        System.out.println("Diferença: " + calc.subtrair(50, 100));
        System.out.println("Produto: " + calc.multiplicar(50, 100));
        System.out.println("Quociente: " + calc.dividir(50, 100));

        do {
            String numero1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
            String numero2 = JOptionPane.showInputDialog("Digite o segundo número: ");

            // Verificações de condições de erro
            if (numero1 == null || numero2 == null) {
                System.exit(0);
            }
            else if (numero1.trim().equals("") || numero2.trim().equals(""))             //.trim() tira os espaços em branco

            {JOptionPane.showMessageDialog
                        (null, "Erro na entrada de dados - digite novamente!");
            }
             else {

                //conversão obrigatória de dados:String para double
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);


// Chamando o método somar ()
                double total = calc.somar(num1, num2);

                JOptionPane.showMessageDialog
                        (null, "Resultado = " + total);
            }
        } while (true);
    }
}