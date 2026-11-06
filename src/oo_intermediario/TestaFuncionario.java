package oo_intermediario;

import java.math.BigDecimal;

    public class TestaFuncionario {
        public static void main(String[] args) {
            Funcionario fulano = new Funcionario(
                    "Fulano da Silva",
                    500,
                    new BigDecimal("1234.56"));

            // 1. Recupera o salário atual
            BigDecimal salarioAntigo = fulano.getSalario();
            // 2. Adiciona R$ 1000,00 ao salário antigo
            BigDecimal novoSalario = salarioAntigo.add(new BigDecimal("1000"));
            // 3. Atribui ao funcionário 'fulano' o novo salário
            fulano.setSalario(novoSalario);
        }
    }