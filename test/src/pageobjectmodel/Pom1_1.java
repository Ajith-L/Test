package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom1_1 {
	//username,userrole,Employeename,status,search
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("searchSystemUser_userName"));
		
	}
	public static WebElement userrole(WebDriver driver){
		return driver.findElement(By.id("searchSystemUser_userType"));
		
	}
	
	public static WebElement employeename(WebDriver driver){
		return driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		
	}
	public static WebElement status(WebDriver driver){
		return driver.findElement(By.id("searchSystemUser_status"));
		
	}
	public static WebElement search(WebDriver driver){
		return driver.findElement(By.id("searchBtn"));
		
	}

}
