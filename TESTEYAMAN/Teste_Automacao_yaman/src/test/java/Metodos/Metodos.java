package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {

	public void escrever(By elemento, String txt) throws IOException {
		try {

			fDriver().findElement(elemento).sendKeys(txt);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao digitar " + e);
			screenShot("erro - evidencia1");
		}

	}

	public void clicar(By elemento) throws IOException {

		try {
			fDriver().findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao clicar " + e);
			screenShot("erro - evidencia2");
		}

	}

	public void screenShot(String nomeSrc) throws IOException {

		try {

			TakesScreenshot srcShot = ((TakesScreenshot) fDriver());
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeSrc + ".png");
			FileUtils.copyFile(srcFile, destFile);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao tirar print " + e);
			screenShot("erro - evidencia3");
		}

	}

	public void scroll() throws IOException {
		try {
		
		JavascriptExecutor jse = (JavascriptExecutor) fDriver();
		jse.executeScript("window.scrollBy(0,250)", "");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro no scroll " + e);
			screenShot("erro - evidencias4");
		}
		
		
		
	}
	
	
	
	
	public void tempo(int tempo) throws InterruptedException, IOException {
		try {
		Thread.sleep(tempo);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro no sleep " + e);
			screenShot("erro - evidencias5");
		}
	}
	
	public void validar(String texto, By elemento) throws IOException {
		try {
		String txtTela = fDriver().findElement(elemento).getText();
		assertEquals(texto, txtTela);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro no sleep " + e);
			screenShot("erro - evidencias6");
		}
	}
	
	
	
}