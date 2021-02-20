package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class data {
	@Test 
	@Parameters({"username","password"})
	public void bothcorrect(String username,String password){
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
	@Test 
	@Parameters({"username","password"})
	public void bothworng(String username,String password){
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
	@Test 
	@Parameters({"username","password"})
	public void onecorrect(String username,String password){
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
	@Test 
	@Parameters({"username","password"})
	public void oneworng(String username,String password){
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