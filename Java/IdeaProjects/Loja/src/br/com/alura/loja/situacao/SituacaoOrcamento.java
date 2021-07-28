package br.com.alura.loja.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }


    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser finalizado");
    }


}
