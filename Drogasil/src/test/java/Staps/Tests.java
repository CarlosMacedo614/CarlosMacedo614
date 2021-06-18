package Staps;
import Elementos.Elementos;
import Pages.Metodos;
import Pages.abrirBrowser;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Tests {
abrirBrowser ab = new abrirBrowser();	
Metodo mt = new Metodos();
	Elementos el = new Elementos();
	@Dado("que eu esteja no {string}")
	public void que_eu_esteja_no(String string) {
	    
	}

	@Quando("eu realizar o teste para ser feito")
	public void eu_realizar_o_teste_para_ser_feito() {
	   
	}

	@Entao("eu valido o teste")
	public void eu_valido_o_teste() {
	 
	}

	
	
}
