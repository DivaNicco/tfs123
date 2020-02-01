package revisagoogle;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	dryRun = false,
	monochrome = true,
	features = {"src/test/resources/"},
	glue = {"revisagoogle/"},
	plugin = {"pretty",
			"html:target/Relatorio1.html", // � o nome do relat�rio em Html
			"json:target/relatorio1.json", // � o nome do relat�rio em json
			"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/relatorio2.html" //Formato do relat�rio
	}
	)
			
public class Runner {
	

}
