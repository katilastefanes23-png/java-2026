package calculadora;

public class TestaCalculadora {
    public static void main (String [] args){
        Calculadora calc = new Calculadora();
        calc.n1 = 40;
        calc.n2 = 2;
        System.out.println(calc.n1);
        System.out.println(calc.n2);

        System.out.println("Soma: " +calc.somar());

        System.out.println("Diferença: " +calc.subtrair());

        System.out.println("Produto: " +calc.multiplicar());

        System.out.println("Quociente: " +calc.dividir());

        System.out.println("Resultado atual: " +calc.mostrarUltimoResultado());

        //com parâmetros
        System.out.println("Soma com parâmetros: " +calc.somar(50,100));
        System.out.println("Diferença com parâmetros: " +calc.subtrair(50,100));
        System.out.println("Produto com parâmetros " +calc.multiplicar(50,100));
        System.out.println("Quociente com parâmetros: " +calc.dividir(50,100));

    }
}
