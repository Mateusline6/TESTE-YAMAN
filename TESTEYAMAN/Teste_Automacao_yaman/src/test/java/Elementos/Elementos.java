package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By pesquisar = By.id("search-input");
	private By btnPesquisar = By.cssSelector("#header-content > header > div > div > section.search > section > form > div > button");
	private By produto = By.cssSelector("#item-list > div.wrapper > div:nth-child(1) > div.item-card__images > a > img");
	private By btnComprar = By.cssSelector("#buy-button-now");
	private By titulo = By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__items > h1");
	private By cor = By.cssSelector("#buy-box > section.product-sku-selector > div > ul > li:nth-child(1) > a > span > img");
	
	
	public By getPesquisar() {
		return pesquisar;
	}
	public void setPesquisar(By pesquisar) {
		this.pesquisar = pesquisar;
	}
	public By getBtnPesquisar() {
		return btnPesquisar;
	}
	public void setBtnPesquisar(By btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}
	public By getProduto() {
		return produto;
	}
	public void setProduto(By produto) {
		this.produto = produto;
	}
	public By getBtnComprar() {
		return btnComprar;
	}
	public void setBtnComprar(By btnComprar) {
		this.btnComprar = btnComprar;
	}
	public By getTitulo() {
		return titulo;
	}
	public void setTitulo(By titulo) {
		this.titulo = titulo;
	}
	public By getCor() {
		return cor;
	}
	public void setCor(By cor) {
		this.cor = cor;
	}
	
}
