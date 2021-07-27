package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado{

    private DadosPessoais dadosPessoais;
    private String Empresa;

    public Terceirizado(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }
}
