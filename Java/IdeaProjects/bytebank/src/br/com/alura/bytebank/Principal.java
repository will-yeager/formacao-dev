package br.com.alura.bytebank;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.io.LeitorXML;
import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.visualizador.OpcoesPagamento;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Principal {

    final static Logger logger = Logger.getLogger(Principal.class);
    
    public static void main(String[] args) throws IOException {
        //new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitor = new LeitorCSV();
        List<Pagamento> pagamentos = leitor.ler(1);

        for (Pagamento pagamento:
             pagamentos) {
            double valorBruto = pagamento.getValor();

            if (valorBruto > 100) {
                double valorComAcrescimo = valorBruto * 1.1;

                pagamento.setValor(valorComAcrescimo);
            }

            System.out.println(pagamento);
        }

    }

}
