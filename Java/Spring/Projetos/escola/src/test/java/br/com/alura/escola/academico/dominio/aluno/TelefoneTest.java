package br.com.alura.escola.academico.dominio.aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriarCriarTelefoneComDDDouNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "99999999"));
    }

    @Test
    void deveriaCriarTelefoneComDDDeNumeroValido() {
        Assertions.assertDoesNotThrow(() -> new Telefone("11", "99999999"));
    }
}