package associacoes;

import java.sql.SQLOutput;

public class TestaAssociacao {
    public static void main(String[] args) {
        Funcionario katila = new Funcionario("Kátila Stefanes", "profª Dra ");
        System.out.println(  katila.nomeCompleto());
        System.out.println(katila);

        Empresa cesmo = new Empresa ("Cesmo", "DER",false);

        cesmo.setDiretora(katila);
        System.out.println("Diretora do Cesmo: " +
                cesmo.getDiretora().nomeCompleto());
    }
}
