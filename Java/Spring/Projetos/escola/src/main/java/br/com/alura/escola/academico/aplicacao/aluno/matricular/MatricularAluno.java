package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.AlunoMatriculado;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    // COMMAND
    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);

        AlunoMatriculado evento = new AlunoMatriculado(new CPF(novo.getCpf()));
        publicador.publicar(evento);
    }
}
