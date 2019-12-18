
package br.com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
          // monochrome = true, snippets = SnippetType.CAMELCASE,
          glue = "br.com.compras.steps",
          // plugin = "src/main/java/ExtentCucumberFormatter",
          features = { "resources/features/compas.feature" }, tags = { "@CT01" }, plugin = ("json:target/Cucumber.json"), monochrome = true, dryRun = false
// plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}

)

public class compras {

}
