package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
