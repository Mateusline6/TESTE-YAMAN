package Metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	
	private static WebDriver driver;
	
	public static WebDriver fDriver() {
		
		return driver;
		
	}
	
	
	public void executarNavegador(String site) {
		
		try {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Executando");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir navegador " +  e);
			
		}
	}
	
	
	
}
