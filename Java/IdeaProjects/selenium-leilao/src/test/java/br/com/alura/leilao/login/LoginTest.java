package br.com.alura.leilao.login;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private LoginPage paginaDeLogin;

    @BeforeClass
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    }

    @Before
    public void beforeEach() {
        this.paginaDeLogin = new LoginPage();
    }

    @After
    public void afterEach() {
        this.paginaDeLogin.fechar();
    }

    @Test
    public void deveriaEfetuarLoginComDadosValidos() {
        paginaDeLogin.preencheFormularioDeLogin("fulano", "pass");
        paginaDeLogin.efetuaLogin();

        Assert.assertFalse(paginaDeLogin.isPaginaDeLogin());
        Assert.assertEquals("fulano", paginaDeLogin.getNomeUsuarioLogado());
    }

    @Test
    public void naoDeveriaEfetuarLoginComDadosInvalidos() {
        paginaDeLogin.preencheFormularioDeLogin("invalido", "123");
        paginaDeLogin.efetuaLogin();

        Assert.assertTrue(paginaDeLogin.isPaginaDeLoginErro());
        Assert.assertNull("fulano", paginaDeLogin.getNomeUsuarioLogado());
        Assert.assertTrue(paginaDeLogin.contemTexto("Usuário e senha inválidos."));
    }

    @Test
    public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
        paginaDeLogin.navegaParaPaginaDeLances();

        Assert.assertTrue(paginaDeLogin.isPaginaDeLogin());
        Assert.assertFalse(paginaDeLogin.contemTexto("Dados do Leilão"));
    }
}
