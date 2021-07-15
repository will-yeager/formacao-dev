package br.com.alura.loja;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.alura.java.Produto;

public class ProdutoTest {

	@Test
	public void test() {
		Produto p = new Produto("teste", BigDecimal.TEN);
		Assert.assertequals("teste"), p.get
	}

}
