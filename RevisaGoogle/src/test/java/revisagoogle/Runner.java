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
			"html:target/Relatorio1.html", // é o nome do relatório em Html
			"json:target/relatorio1.json", // é o nome do relatório em json
			"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/relatorio2.html" //Formato do relatório
	}
	)
			
public class Runner {
	

}
