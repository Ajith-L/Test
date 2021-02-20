package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjectmodel.Pom1_1;
import pageobjectmodel.pom1;

public class pomexm1 {
	
	@Test
	public void login(){
	System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
     
     pom1.username(driver).sendKeys("Admin");
     pom1.password(driver).sendKeys("admin123");
     pom1.button(driver).click();
     
     WebElement link= driver.findElement(By.linkText("Admin"));
     link.click();
     
     Pom1_1.username(driver).sendKeys("Marjal");
     Pom1_1.userrole(driver).sendKeys("ESS");
     Pom1_1.employeename(driver).sendKeys("Maria Isabell Bella");
     Pom1_1.status(driver).sendKeys("Enabled");
     Pom1_1.search(driver).click();
	}
}
