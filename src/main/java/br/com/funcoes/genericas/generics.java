package br.com.funcoes.genericas;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;







import org.apache.commons.io.FileUtils;
//import org.openqa.grid.common.JSONConfigurationUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import br.com.funcoes.genericas.CT;
import br.com.page.objects.screenGoogle;

public class generics {
	
	private static String path = "";

    private static String url = "";

    private static WebElement element = null;
    
    private static int id = 0;

    private static WebDriver driver = null;
    
	public static String browser;
	public static String scenarioName;
	public static String executionFolder;
	static org.slf4j.Logger logger = LoggerFactory.getLogger(generics.class);
	private int linha = 0;
	private String ExecutionFolder = LocalDateTime.now().toString().replaceAll(":", "").replace("-", "").replace(".", "");
	

	  public generics(String scenarioName, String executionFolder){
	  //this.scenarioName = scenarioName; this.executionFolder = executionFolder; 
	  }
	  
	 

	    //**********************************************************************************************************************************************************
		// ABRE NAVEGADOR                                                                                                                 						   *
		//**********************************************************************************************************************************************************

		/**
		 * @param abreNavegador
		 * @param Abre navegador - Home Login
		 *            navegador - Home Login
		 */
		public static WebDriver abreNavegador(String p0) throws Exception {

			// chamando navegador
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			
			// instanciando o navegador
			WebDriver driver = new ChromeDriver();
			
			// abrir URL homologacao
			if( p0.equals("Google"))
			{
			driver.get("https://google.com/");
			}
			if( p0.equals("automationprice"))
			{
			driver.get("http://automationpractice.com/index.php");
			}
			// abrir URL desenvolvimento
			
			driver.manage().window().maximize();

			Thread.sleep(5000);
			
			return driver;
		}
		
		public static void Evidencia(WebDriver driver, String ct, String runfolder) throws IOException {

	        id = id + 1;
	        String pathCucumber = "C:\\2Automation\\Reports";//System.getProperty("PATH_OUTPUT");
	        File folder = new File(pathCucumber + "\\" + ct);
//	        System.out.println(">>>>>>>>>>>>>>>>>>>>>>> o tamanho é : " + folder.getAbsolutePath().toString());
	        if (!folder.exists()) {
	            if (folder.mkdirs()) {
	                path = pathCucumber + "\\" + ct;
	                id = 1;
	            } else {
	                System.out.println("Falha ao criar diretório!");
	            }
	        }
	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	        	
	        	File dest = new File(folder + "\\Step" + id + ".jpg");
	        	FileUtils.copyFile(scrFile, dest);
	        	System.out.println(scrFile + " - " + dest);
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }

	    }
		 
}

