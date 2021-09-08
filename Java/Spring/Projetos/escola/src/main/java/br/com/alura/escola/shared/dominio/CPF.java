package br.com.alura.escola.shared.dominio;

public class CPF {

    private String numero;

    public CPF(String numero) {
        if(numero == null || !numero.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
            throw new IllegalArgumentException("CPF Invalido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
