package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;
import org.w3c.dom.DOMException;

import java.math.BigDecimal;
import java.security.DomainCombiner;

public class Aprovado extends SituacaoOrcamento{
    public BigDecimal calculçarValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
