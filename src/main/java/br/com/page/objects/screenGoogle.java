package br.com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class screenGoogle {

	private static WebElement element = null;
	
	public static WebElement txtPesquisar (WebDriver driver){
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement txtBoxUsuarioLogin (WebDriver driver){
		element = driver.findElement(By.id("user_id"));
		return element;
	}
	
	public static WebElement txtBoxSenhaLogin (WebDriver driver){
		element = driver.findElement(By.id("pass_id"));
		return element;
	}

	public static WebElement selectInstituicaoLogin (WebDriver driver){
		element = driver.findElement(By.id("institutionId"));
		return element;
	}

	public static WebElement selectFilialLogin (WebDriver driver){
		element = driver.findElement(By.id("logicalBranchId"));
		return element;
	}
	
	public static WebElement selectIdiomaLogin (WebDriver driver){
		element = driver.findElement(By.id("languageChooseId"));
		return element;
	}
	
	public static WebElement btnLogin (WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='login_container']/table/tbody/tr[7]/td[2]/input"));
		return element;
	}
}

