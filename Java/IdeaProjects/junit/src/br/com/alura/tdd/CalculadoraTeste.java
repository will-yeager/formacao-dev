package br.com.alura.tdd;


import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

    @Test
    public void deveriaSomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int soma = calc.soma(3, 7);

        Assert.assertEquals(10, soma);
    }
}
