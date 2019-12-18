
package br.com.pesquisa.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import br.com.funcoes.genericas.generics;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.LoggerFactory;

public class Pesquisar {

     // **********************************************************************************************************************************************************
     // Declarando as variáveis
     // **********************************************************************************************************************************************************

     WebDriver driver = null;

     // org.slf4j.Logger logger = LoggerFactory.getLogger(generics.class);
     private int linha = 0;

     private String ExecutionFolder = LocalDateTime.now().toString().replaceAll(":", "").replace("-", "").replace(".", "");

     private String scenarioName = "";

     @Before
     public void setup(Scenario sc) throws RuntimeException, IOException, Exception {

          this.scenarioName = sc.getName().replace("-", "").replace("\"", "").replaceAll(" ", "");

     }

     @Dado("^que esteje no site de pesquisa \"([^\"]*)\"$")
     public void queEstejeNoSiteDePesquisaGoogle(String p0) throws Throwable {
          // Write code here that turns the phrase above into concrete actions

          this.driver = generics.abreNavegador(p0);
          // Gerando evidencia
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Dado("^informe no campo pesquisa o nome de um diretor \"([^\"]*)\" e o fime \"([^\"]*)\"$")
     public void informeNoCampoPesquisaONomeDeUmDiretorDeFilmesStevenSpielberg(String arg0, String arg1) throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          WebElement element = driver.findElement(By.name("q"));
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
          element.sendKeys(arg0 + " " + arg1);
     }

     @Quando("^clicar em Pesquisar$")
     public void clicarEmPesquisar() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          WebElement element = driver.findElement(By.name("q"));
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
          element.submit();
     }

     @Entao("^devo apresentar a quantidade de filmes \"([^\"]*)\" deste diretor$")
     public void devoApresentarAQuantidadeDeFilmesDesteDiretor(String arg0) throws Throwable {
          // Write code here that turns the phrase above into concrete actions

          generics.Evidencia(driver, scenarioName, ExecutionFolder);

          System.out.println("======================================================================");
          WebElement result = driver.findElement(By.id("resultStats"));
          result.click();
          System.out.println("Total de Resultados :" + result.getText());

     }

     @After
     public void tearDown() throws Throwable {

          // driver.quit();
          driver.close();

     }

}
