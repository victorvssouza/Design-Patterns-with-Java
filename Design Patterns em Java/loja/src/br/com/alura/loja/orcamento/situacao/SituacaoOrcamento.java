package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
    public BigDecimal calculçarValorDescontoExtra(Orcamento orcamento) {
        throw
    }
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }
}
