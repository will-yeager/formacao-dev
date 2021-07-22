package br.com.alura.bytebank.registrador;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.validador.ValidaPagamento;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamento {

    private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();
    private final ValidaPagamento validaPagamento = new ValidaPagamento();

    public void registra(List<Pagamento> pagamentos) {
        for (int i = 0; i < pagamentos.size(); i++) {
            Pagamento pagamento = pagamentos.get(i);
            validaPagamento.verificaTipo(pagamento);
            salva(pagamento);
        }
        exibeEfetuados();
    }

    private void exibeEfetuados() {
        if (!PAGAMENTOS.isEmpty()) {
            System.out.println("Todos os pagamentos");
            for (int i = 0; i < PAGAMENTOS.size(); i++) {
                System.out.println(PAGAMENTOS.get(i));
            }
        } else {
            System.out.println("Não temos pagamentos");
        }
    }

    private void verificaTipo(Pagamento pagamento) {
        validaPagamento.verificaTipo(pagamento);
    }

    private void salva(Pagamento pagamento) {
        PAGAMENTOS.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }

}
