package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import Runner.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	Metodos m = new Metodos();
	Elementos l = new Elementos();
	Runner r = new Runner();
	
	@Given("Eu esteja no site {string}")
	public void eu_esteja_no_site(String string) throws IOException {
	   
		m.executarNavegador(string);
		m.screenShot("Ct01 - evidencia1");
		
	}

	@Given("Pesquiso o produto {string}")
	public void pesquiso_o_produto(String string) throws IOException {
	    m.escrever(l.getPesquisar(), string);
	    m.screenShot("CT02 - evidencia2");
	    m.clicar(l.getBtnPesquisar());
	    m.clicar(l.getProduto());
	    
	}

	@When("Incluir produto no carrinho")
	public void incluir_produto_no_carrinho() throws IOException, InterruptedException {
	    m.clicar(l.getCor());
	    m.screenShot("CT03 - evidencia3");
	    m.scroll();
	    m.tempo(6);
	    m.clicar(l.getBtnComprar());
	  
	}

	@Then("Valido as informacoes")
	public void valido_as_informacoes() throws IOException {
	   
		
		m.validar("Meu carrinho", l.getTitulo());
		m.screenShot("Ct04 - evidencia4");
		r.fechar();
	}
	
	
	
	
}
