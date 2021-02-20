package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class examples {
	
    @Test
	public void login(){
    
    	
		 System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 WebElement usn = driver.findElement(By.xpath("//*[@name='txtUsername]/ancestor::*"));
		 usn.sendKeys("Adin");
		  WebElement pwd =driver.findElement(By.xpath("//*[@id='divPassword']/child::input"));
		  pwd.sendKeys("admin123");
		  
		  WebElement btn =driver.findElement(By.xpath(""));
		  btn.click();
		  
		  //driver.close();
	 }
}
