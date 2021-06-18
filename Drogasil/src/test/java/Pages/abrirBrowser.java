package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abrirBrowser {
	/**
	 * Abrir navegador e site
	 * 
	 * @author Phelipe S Miranda
	 * @param site
	 * @param navegador
	 * @param descricaoPasso
	 * @throws IOException
	 */
	WebDriver driver;

	// para abrir o Browser
	public void abrirCHROME(String Site, String DescricaoPasso) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Site);
		driver.manage().window().maximize();
	}

	public void abrirFIRE(String Site, String descricaoPasso) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(Site);
		driver.manage().window().maximize();
	}

	/**
	 * Fechar Navegador
	 * 
	 * @author Thiago de Souza
	 * @param descricaoPasso
	 * @throws IOException
	 */

	public void fecharNavegador(String descricaoPasso) throws IOException {

		try {
			driver.quit();
		} catch (Exception e) {
			printScreenErros("Erro ao tentar -- " + descricaoPasso);

		}
	}

	/**
	 * Print Screen de Erros
	 * 
	 * @author Thiago de Souza
	 * @param nomePrint
	 * @throws IOException
	 */

	public void printScreenErros(String descricaoPasso) throws IOException {

		TakesScreenshot print = ((TakesScreenshot) driver);
		File SrcFile = print.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/Evidências/Erros/" + descricaoPasso + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
