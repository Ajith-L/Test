package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom1 {
   //username,password,button
	
	public static WebElement username(WebDriver driver){
		return driver.findElement(By.id("txtUsername"));
	}
	
	public static WebElement password(WebDriver driver){
		return driver.findElement(By.id("txtPassword"));
		 
		
	}
	
	public static WebElement button(WebDriver driver){
		return driver.findElement(By.id("btnLogin"));
		
	}
}
