package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data1 {
	
	String [][] data={
	{" Admin","admin123"},
	{" Admin","ad"},
	{"aji","lk"},
	{"jk","admin123"}
	};
	@DataProvider (name="tree")
	public String[][] send(){
		return data;
	}
	
	@Test(dataProvider="tree")
	public void login(String username,String password){
		 System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 WebElement usn = driver.findElement(By.id("txtUsername"));
		 usn.sendKeys(username);
		  WebElement pwd =driver.findElement(By.id("txtPassword"));
		  pwd.sendKeys(password);
		  
		  WebElement btn =driver.findElement(By.id("btnLogin"));
		  btn.click();
		  
		  driver.close();
	 }
	
}
