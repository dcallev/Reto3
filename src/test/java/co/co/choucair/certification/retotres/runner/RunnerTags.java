package co.co.choucair.certification.retotres.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/retotres.feature",
        tags = "@Regression",
        glue = {"co.co.choucair.certification.retotres.stepdefinitions","co.co.choucair.certification.retotres.util"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
