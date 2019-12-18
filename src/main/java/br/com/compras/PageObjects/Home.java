package br.com.compras.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
private static WebElement element = null;
	
	public static WebElement txtBoxLogin (WebDriver driver){
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement txtBoxSenha (WebDriver driver){
		element = driver.findElement(By.id("passwd"));
		return element;
	}

}
