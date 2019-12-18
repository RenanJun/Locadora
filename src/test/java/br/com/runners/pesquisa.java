
package br.com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" },
          // monochrome = true, snippets = SnippetType.CAMELCASE,
          glue = "br.com.pesquisa.steps", plugin = "ExtentCucumberFormatter", features = { "resources/features/pesquisaGoogle.feature" }, tags = { "@CT01" })
public class pesquisa {

}
