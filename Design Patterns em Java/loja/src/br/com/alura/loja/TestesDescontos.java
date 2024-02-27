package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos extends ISS {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 4);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
