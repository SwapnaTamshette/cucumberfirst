package cucumberp;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions (
			plugin= {"html:src/test/java/cucumberp/output/cucumber-html-report",
					"json:src/test/java/cucumberp/output/cucumber.json",
					"junit:src/test/java/cucumberp/output/cucumber-results.xml"
                })
@RunWith(Cucumber.class)
public class run {

}
