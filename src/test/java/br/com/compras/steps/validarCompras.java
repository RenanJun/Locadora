
package br.com.compras.steps;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import br.com.utils.ReportUtils;
import br.com.compras.PageObjects.*;
import br.com.funcoes.genericas.generics;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class validarCompras {

     // **********************************************************************************************************************************************************
     // Declarando as variáveis
     // **********************************************************************************************************************************************************
     private String step;

     WebDriver driver = null;

     // org.slf4j.Logger logger = LoggerFactory.getLogger(generics.class);
     private int linha = 0;

     private String ExecutionFolder = LocalDateTime.now().toString().replaceAll(":", "").replace("-", "").replace(".", "");

     private String scenarioName = "";
     // private CT _ct;

     @Before
     public void setup(Scenario sc) throws RuntimeException, IOException, Exception {

          this.scenarioName = sc.getName().replace("-", "").replace("\"", "").replaceAll(" ", "");
          // _ct = Constants.retornaCTs().get(linha);

     }

     @Dado("^que esteje no site de pesquisa \"([^\"]*)\"$")
     public void que_esteje_no_site_de_pesquisa(String arg1) throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          this.driver = generics.abreNavegador(arg1);
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
          ReportUtils.report(scenarioName, "");

     }

     @Dado("^clique em SigIn$")
     public void clique_em_SigIn() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          WebElement element = driver.findElement(By.cssSelector("a[class='login']"));
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
          element.click();
          ReportUtils.report("Clique em SigIn", "");

     }

     @Dado("^preencha os campos \"([^\"]*)\" e \"([^\"]*)\"$")
     public void preencha_os_campos_e(String arg1, String arg2) throws Throwable {
          // Write code here that turns the phrase above into concrete actions

          WebElement login = Home.txtBoxLogin(driver);
          assertEquals("Login Sucesso", "", login.getAttribute("value"));
          // WebElement element = driver.findElement(By.id("email"));
          // element.sendKeys(arg1);

          WebElement Senha = Home.txtBoxSenha(driver);
          assertEquals("Senha Sucesso", "", Senha.getAttribute("value"));

          // WebElement element1 = driver.findElement(By.id("passwd"));
          // element1.sendKeys(arg2);

          generics.Evidencia(driver, scenarioName, ExecutionFolder);
          ReportUtils.report("Preenche os campos" + arg1 + " - " + arg2, "");
     }

     @Dado("^Clica em SubmitSigIn$")
     public void clica_em_SubmitSigIn() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          WebElement element = driver.findElement(By.id("SubmitLogin"));
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
          element.click();

     }

     @Dado("^Pesquisa o produto \"([^\"]*)\"$")
     public void pesquisa_o_produto(String arg1) throws Throwable {
          // Write code here that turns the phrase above into concrete actions

          WebElement element = driver.findElement(By.id("search_query_top"));
          element.sendKeys(arg1);
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
          element.submit();
     }

     @Dado("^Seleciona produto \"([^\"]*)\"$")
     public void seleciona_produto(String arg1) throws Throwable {
          // Write code here that turns the phrase above into concrete actions

          // WebElement element = driver.findElement(By.xpath("(.//[@href='"+ arg1 +"'])"));
          WebElement element = driver.findElement(By.xpath("//a[@href='" + arg1 + "']"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Dado("^Add to cart$")
     public void Add_To_Cart() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          WebElement element = driver.findElement(By.id("add_to_cart"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Dado("^Proceed to checkout$")
     public void proceed_to_checkout() throws Throwable {
          // Write code here that turns the phrase above into concrete actions

          JavascriptExecutor js = (JavascriptExecutor) driver;
          Thread.sleep(5000);
          WebDriverWait wait = new WebDriverWait(driver, 2);
          WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), 'Proceed to checkout')]")));
          js.executeScript("arguments[0].scrollIntoView();", element);
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Dado("^Proceed to checkout1$")
     public void proceed_to_checkout1() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          Thread.sleep(2000);
          WebElement element = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Dado("^Proceed to checkout2$")
     public void proceed_to_checkout2() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          Thread.sleep(2000);
          WebElement element = driver.findElement(By.name("processCarrier"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Dado("^Concorde com os termos$")
     public void concorde_com_os_termos() throws Throwable {
          // Write code here that turns the phrase above into concrete actions

          WebElement element = driver.findElement(By.id("cgv"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);

     }

     @Dado("^PaybyBankWire$")
     public void PaybyBankWire() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          Thread.sleep(2000);
          WebElement element = driver.findElement(By.className("payment_module"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Quando("^Confirmar meu pedido$")
     public void confirmar_meu_pedido() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          Thread.sleep(2000);
          WebElement element = driver.findElement(By.xpath("//span[.='I confirm my order']"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @Entao("^Confirma pedido$")
     public void confirma_pedido() throws Throwable {

          // Write code here that turns the phrase above into concrete actions
          Thread.sleep(2000);
          WebElement element = driver.findElement(By.xpath("//span[.='navigation_page']"));
          element.click();
          generics.Evidencia(driver, scenarioName, ExecutionFolder);
     }

     @After
     public void tearDown() throws Throwable {

          Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
          Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
          Reporter.setSystemInfo("User Name", "AJ");
          Reporter.setSystemInfo("Application Name", "Test App ");
          Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
          Reporter.setSystemInfo("Environment", "Production");
          Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

          // driver.quit();
          driver.close();

     }

}
