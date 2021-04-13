package Runner;

import org.junit.runner.RunWith;

import Metodos.Browser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(


	features = "src/test/resources/Features",
	glue = "Steps",
	tags = "@executa",
	dryRun = false,
	monochrome = true,
	plugin = {"pretty" , "html:target/report.html" , "json:target/report.json"}


)

public class Runner extends Browser{

public void fechar() {
		
		try {
		fDriver().quit();
		System.out.println("Validado com sucesso");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao fechar " + e);
		}
		
		
	}
	
	
}
