package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;

public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }

}

