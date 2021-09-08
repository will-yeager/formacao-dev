package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void criarAluno() {
        this.aluno = new Aluno(new CPF("123.456.789-00"), "Teste", new Email("teste@gmail.com"));
    }

    @Test
    void deveriaPermitirUmTelefone() {
        aluno.adicionarTelefone("11", "99999999");
        assertEquals(1, aluno.getTelefones().size());
    }

    @Test
    void deveriaPermitirDoisTelefones() {
        aluno.adicionarTelefone("11", "99999999");
        aluno.adicionarTelefone("11", "88888888");
        assertEquals(2, aluno.getTelefones().size());
    }

    @Test
    void deveriaNaoAceitarMaisQueDoisTelefones() {
        assertThrows(IllegalArgumentException.class, () -> {
            aluno.adicionarTelefone("11", "99999999");
            aluno.adicionarTelefone("11", "88888888");
            aluno.adicionarTelefone("11", "77777777");
        });
    }

}