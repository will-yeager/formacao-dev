package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;

    private String senha;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String telefone) {
        if(telefones.size() == 2) {
            throw new IllegalArgumentException("Atingido o numero máximo de telefones");
        }
        this.telefones.add(new Telefone(ddd, telefone));
    }

    public String getCpf() {
        return this.cpf.getNumero();
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
